package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Basket;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.Subscription;
import by.fpmi.pharmacy.services.MedicineService;
import by.fpmi.pharmacy.services.SubscriptionService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatiana on 23.12.2016.
 */
@Controller
public class SubscriptionController {
    @Autowired
    private MedicineService medicineService;

    @Autowired
    private UserService userService;

    @Autowired
    private SubscriptionService subscriptionService;


    @RequestMapping(value = "/subscription", method = RequestMethod.GET)
    public String subscriptionPage(Model model){
        List<Medicine> medicines = new ArrayList<>();
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        List<Subscription> subscription = subscriptionService.getUserSubscriptions(user.getIdUser());


        if(subscription != null){

            for(Subscription subscriptions : subscription){
                medicines.add(subscriptions.getIdMedicine());
            }
            //Medicine medicines = subscription.getIdMedicine();
            model.addAttribute("subscription", subscription);
            model.addAttribute("medicineInSubscr", medicines);
            return "subscription";
        }
        model.addAttribute("msg" ,"Корзина пуста");
        return "subscription";
    }
}
