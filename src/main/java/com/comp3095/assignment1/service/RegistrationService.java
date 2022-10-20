package com.comp3095.assignment1.service;

<<<<<<< HEAD
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
=======
import com.comp3095.assignment1.model.RegisterUser;

public class RegistrationService {
    public String register(RegisterUser newUser) {
        return  null;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    }
}
