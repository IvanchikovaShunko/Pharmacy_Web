package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.UserDetail;
import by.fpmi.pharmacy.services.BasketService;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.SubscriptionService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tatiana on 23.12.2016.
 */
@Controller
public class AboutController {
    @Autowired
    MedicineService medicineService;

    @Autowired
    BasketService basketService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage( ModelMap model) {

        return "aboutMedicine";
    }

    @RequestMapping(value = "/about/{idMedicine}", method = RequestMethod.GET)
    public String aboutPageMed(@PathVariable("idMedicine")int id, ModelMap model) {
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        Medicine medicine = medicineService.getById(id);
        model.addAttribute("medicine", medicine );
        return "aboutMedicine";
    }

}
