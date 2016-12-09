package by.fpmi.pharmacy.controller;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IvanchikovaA on 09.12.2016.
 */


@Controller
public class UserController {

//    private AuthenticationManager authManager;
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = { "/welcome**" }, method = RequestMethod.GET)
//    public ModelAndView defaultPage() {
//        return new ModelAndView("../pages/welcome");
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public ModelAndView login(@RequestParam(value = "error") String error,
//                              @RequestParam(value = "logout") String logout,
//                              HttpServletRequest request) {
//
//        ModelAndView model = new ModelAndView("../index");
//        if (error != null) {
//            model.addObject("error", "Invalid username and password!");
//        }
//
//        if (logout != null) {
//            model.addObject("msg", "You've been logged out successfully.");
//        }
//
//
//
//        return model;
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public ModelAndView registerUser(@ModelAttribute("user") User accountDto, BindingResult result, Errors errors, HttpServletRequest request){
//        User registered = new User();
//        if (!result.hasErrors()) {
//            registered = createUserAccount(accountDto, result);
//        }
//        if (registered == null) {
//            result.rejectValue("email", "message.regError");
//        }
//        if (result.hasErrors()) {
//            return new ModelAndView("../../index", "user", accountDto);
//        }
//        else {
//            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(registered.getLogin(), registered.getPassword());
//
//            Authentication authentication = authManager.authenticate(token);
//
//            SecurityContextHolder.getContext().setAuthentication(authentication );
//
//            //this step is important, otherwise the new login is not in session which is required by Spring Security
//            request.getSession().setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());
//            request.getSession().setAttribute("user", registered);
//            request.getSession().setAttribute("username", registered.getLogin());
//            request.getSession().setAttribute("authorities", authentication.getAuthorities());
//            return new ModelAndView("dashboard");
//        }
//    }
//
//    private User createUserAccount(User accountDto, BindingResult result) {
//        User registered = null;
//        try {
//            registered = userService.registerNewUserAccount(accountDto);
//        } catch (NullPointerException e) {
//            return null;
//        }
//        return registered;
//    }
}



