package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IvanchikovaA on 16.12.2016.
 */
@Controller
public class MedicineController {

    @Autowired
    MedicineService medicineService;


//    @RequestMapping(value = "/catalog", method = RequestMethod.POST)
//    public ModelAndView listMedicine(Model model) {
//        ModelAndView modelAndView = new ModelAndView("catalog");
//        List<Medicine> medicineList = medicineService.listMedicines();
//        model.addAttribute("medicine.list", medicineList);
//        return modelAndView;
//    }
}
