package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Basket;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.Subscription;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.BasketService;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

/**
 * Created by IvanchikovaA on 22.12.2016.
 */
@Controller
public class BasketController {

    @Autowired
    BasketService basketService;

    @Autowired
    private MedicineService medicineService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/basket", method = RequestMethod.GET)
    public String bagPage(Model model){
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        Basket basket = basketService.getByUserId(user.getIdUser());

        if(basket != null){
            List<Medicine> medicines = basket.getMedicines();
            int sum = 0;
            for(Medicine medicine : medicines) {
                sum += medicine.getCost();
            }
                model.addAttribute("sum", sum);
            model.addAttribute("medicineInBasket", medicines);
            return "bag";
        }
        model.addAttribute("msg" ,"Корзина пуста");
        return "bag";
    }

    @RequestMapping(value = "/basket/{sum}", method = RequestMethod.POST)
    public String addSubscription(@PathVariable("sum") int sum, Model model) {
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        Basket basket = basketService.getByUserId(user.getIdUser());
        basketService.clearBasket(basket);

        return "bag";
    }

}
