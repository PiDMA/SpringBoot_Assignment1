package com.comp3095.assignment1.controller;

import com.comp3095.assignment1.model.Recipe;
import com.comp3095.assignment1.model.RegisterUser;
import com.comp3095.assignment1.model.User;
import com.comp3095.assignment1.repository.UserRepository;
import com.comp3095.assignment1.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping(path ="v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;
    private final UserRepository userRepository;
    @PostMapping
    public String register(@RequestBody RegisterUser newUser){
        return registrationService.register(newUser);
    }
    // Read operation

}
