package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Basket;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.BasketService;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView bagPage(){
        ModelAndView model = new ModelAndView("bag");
        return model;
    }


    @RequestMapping(value = "/basket", method = RequestMethod.POST)
    public String showAddPublishHouse(Model model) {
        model.addAttribute("basket", new Basket());
        return "bag";
    }

    @RequestMapping(value = "/basket/add", method = RequestMethod.GET)
    public String showUpdateUserForm(Model model) {

        //model.addAttribute("publishHouseForm", new Basket());
        return "catalog";
    }

    @RequestMapping(value = "/basket/add", method = RequestMethod.POST)
    public String showUpdateUserForm(@PathVariable String userName,
                                     @RequestParam(value = "medicine_id") int medicineId, Model model) {

        User user = userService.readUserByUsername(userName);
        Medicine medicine = medicineService.getById(medicineId);
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
            return "catalog";
        }


//        model.addAttribute("userForm", user);
//
//        populateDefaultModel(model);

        return "catalog";
    }

}
