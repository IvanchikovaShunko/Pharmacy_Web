package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Basket;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.BasketService;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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



    @RequestMapping(value = "/catalog/{medicineName}", method = RequestMethod.POST)
    public void addMedicineInBasket(@PathVariable("medicineName") String userName) {
        User user = userService.readUserByUsername(userName);

    }



}
