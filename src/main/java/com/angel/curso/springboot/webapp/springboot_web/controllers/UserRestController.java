package com.angel.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.angel.curso.springboot.webapp.springboot_web.models.User;
import com.angel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api") // Ruta base

public class UserRestController {
    @GetMapping("/details") // Ruta secundaria del controlador
    public UserDto details(Model model) {

        UserDto UserDto = new UserDto();
        User user = new User("Angel", "Ramirez");// Instancia de la clase User
        UserDto.setUser(user);
        UserDto.setTitle("Hola mundo Spring Boot");

        return UserDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Angel", "Ramirez");
        User user2 = new User("Andrez", "Guzman");
        User user3 = new User("Jhon", "Doe");

        List<User> users = Arrays.asList(user, user2, user3);// Lo mismo que abajo, pero mas limpio
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/details-map") // Ruta secundaria del controlador
    public Map<String, Object> detailsMap() {
        User user = new User("Angel", "Ramirez");// Instancia de la clase User
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);
        return body;
    }
}