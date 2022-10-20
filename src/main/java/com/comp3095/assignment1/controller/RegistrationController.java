package com.comp3095.assignment1.controller;

import com.comp3095.assignment1.model.RegisterUser;
import com.comp3095.assignment1.service.RegistrationService;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;
<<<<<<< HEAD
    @PostMapping
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    public String register(@RequestBody RegisterUser newUser){
        return registrationService.register(newUser);
    }
}
