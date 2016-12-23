package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.model.UserDetail;
import by.fpmi.pharmacy.services.UserDetailsService;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IvanchikovaA on 23.12.2016.
 */
@Controller
public class ProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;


    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profilePage(Model model){
        org.springframework.security.core.userdetails.User authUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        by.fpmi.pharmacy.model.User  user = userService.readUserByUsername(authUser.getUsername());
        UserDetail userDetail = userDetailsService.getUserById(user.getIdUserDetail().getIdUserDet());
        model.addAttribute("users", userDetail );
        return "profile";
    }


}
