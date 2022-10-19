package com.comp3095.assignment1.controller;

import com.comp3095.assignment1.model.RegisterUser;
import com.comp3095.assignment1.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;
    public String register(@RequestBody RegisterUser newUser){
        return registrationService.register(newUser);
    }
}
