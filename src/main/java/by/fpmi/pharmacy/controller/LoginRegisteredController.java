package by.fpmi.pharmacy.controller;

import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Tatiana on 09.12.2016.
 */
@Controller
public class LoginRegisteredController {
    @Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager authManager;

    @Autowired
    @Qualifier("sessionRegistry")
    private SessionRegistry sessionRegistry;

    @Autowired
    private UserService userService;





    @RequestMapping(value = "/loginAnonymous", method = RequestMethod.GET)
    public ModelAndView loginAnonymous(@RequestParam(value = "error", required = false) String error,
                                       @RequestParam(value = "logout", required = false) String logout,
                                       HttpServletRequest request) {

        ModelAndView model = new ModelAndView("login");
        if (error != null) {
            model.addObject("error", "Неправильное имя пользователя и/или пароль");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }

        return model;
    }



}
