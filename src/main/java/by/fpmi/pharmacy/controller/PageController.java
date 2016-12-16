package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by IvanchikovaA on 13.12.2016.
 */
@Controller
public class PageController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public String medicinePage(ModelMap model) {
        List<Medicine> medicineList = medicineService.listMedicines();
        model.addAttribute("message", medicineList);
        return "catalog";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView profilePage(){
        ModelAndView model = new ModelAndView("profile");
        return model;
    }

    @RequestMapping(value = "/subscription", method = RequestMethod.GET)
    public ModelAndView subscriptionPage(){
        ModelAndView model = new ModelAndView("subscription");
        return model;
    }


    @RequestMapping(value = "/bag", method = RequestMethod.GET)
    public ModelAndView bagPage(){
        ModelAndView model = new ModelAndView("bag");
        return model;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcomePage(){
        ModelAndView model = new ModelAndView("welcome");
        return model;
    }


}
