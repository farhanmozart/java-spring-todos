package com.mandiri.login;

import lombok.Data;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticateService authenticateService;

    public LoginController(AuthenticateService authenticateService) {
        this.authenticateService = authenticateService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {
        if (authenticateService.authenticate(name, password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "welcome";
        }
        modelMap.put("errorMessage", "Invalid credentials!");
        return "login";
    }
}
