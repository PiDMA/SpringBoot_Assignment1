package com.comp3095.assignment1.service;

import com.comp3095.assignment1.model.AppUserRole;
import com.comp3095.assignment1.model.RegisterUser;
import com.comp3095.assignment1.model.User;
import com.comp3095.assignment1.service.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final  UserServiceImpl userService;
    private EmailValidator emailValidator;
    public String register(RegisterUser newUser) {
     boolean isValidEmail =
             emailValidator.test(newUser.getEmail());
     if(!isValidEmail){
         throw new IllegalStateException("Email not valid");
     }


        return  userService.signUpUser(
                new User(
                        newUser.getFirstName(),
                        newUser.getLastName(),
                        newUser.getEmail(),
                        newUser.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
