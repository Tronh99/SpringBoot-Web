package com.angel.curso.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.angel.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Angel", "Ramirez");
        user.setEmail("aramirez@email.com");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "lista de usuarios!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        List<User> users = Arrays.asList(
                new User("Pepa", "Pig", "ppig@email.com"),
                new User("Alfredo", "Adame"),
                new User("Andres", "Doe", "adoe@email.com"));
                return users;
    }

}
