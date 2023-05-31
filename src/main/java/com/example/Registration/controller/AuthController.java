package com.example.Registration.controller;

import com.example.Registration.dto.UserDto;
import com.example.Registration.entity.cms.User;
import com.example.Registration.service.Impl.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AuthController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/")
    public String h(){
        return "auth";
    }

    @GetMapping("auth")
    public String home() {
        return "auth";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }


    @GetMapping("register")
    public String showRegistrationForm(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }


    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model) {
        User existing = userService.findUserByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }
    @GetMapping("/home")
    public String homep() {
        return "home";
    }

}