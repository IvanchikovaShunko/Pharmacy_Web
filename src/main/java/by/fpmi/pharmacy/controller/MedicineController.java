package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Basket;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.Subscription;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.BasketService;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.SubscriptionService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IvanchikovaA on 16.12.2016.
 */
@Controller
public class MedicineController {

    @Autowired
    MedicineService medicineService;

    @Autowired
    BasketService basketService;

    @Autowired
    private UserService userService;

    @Autowired
    private SubscriptionService subscriptionService;

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public String medicinePage(ModelMap model) {
        List<Medicine> medicineList = medicineService.listMedicines();
        model.addAttribute("medicine", medicineList);

        return "catalog";
    }

    @RequestMapping(value = "/catalog", method = RequestMethod.POST)
    public String showUpdateCatalog(Model model) {
        model.addAttribute("basket", new Basket());
        return "catalog";
    }


    @RequestMapping(value = "/catalog/{medicineId}", method = RequestMethod.POST)
    public String addMedicineInBasket(@PathVariable("medicineId") int id, Model model) {
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
      //  User user = userService.readUserByUsername(userName);
        Medicine medicine = medicineService.getById(id);
        Basket basket = basketService.getByUserId(user.getIdUser());

        if (medicine != null) {
            if (basket == null) {
                basket = new Basket();
                basket.setIdUser(user);
                basket.addMedicine(medicine);
                basketService.save(basket);
            } else {
                basket.addMedicine(medicine);
                basketService.update(basket);
            }
            List<Medicine> medicineList = medicineService.listMedicines();
            model.addAttribute("medicine", medicineList);
            return "catalog";
        }

        return "catalog";
    }


    @RequestMapping(value = "/catalog/{medicineName}/{medicineId}", method = RequestMethod.POST)
    public String addSubscription(@PathVariable("medicineName") String name,
                                  @PathVariable("medicineId") int id, Model model) {
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        //  User user = userService.readUserByUsername(userName);
        Medicine medicine = medicineService.findByName(name);
        Subscription subscription = subscriptionService.getByUserId(user.getIdUser());

        if (medicine != null) {
            if(subscription == null){
                subscription = new Subscription();
                subscription.setIdMedicine(medicine);
                subscription.setIdUser(user);
                subscription.setSubscription(true);
                subscription.setSubscriptionPeriod(14);
                subscriptionService.save(subscription);
                model.addAttribute("msg", "Вы подписались на это лекарство");
            }
            else{
                model.addAttribute("msg", "Вы уже подписаны на это лекарство");
            }

            List<Medicine> medicineList = medicineService.listMedicines();
            model.addAttribute("medicine", medicineList);
            return "catalog";
        }

        return "catalog";
    }

}
