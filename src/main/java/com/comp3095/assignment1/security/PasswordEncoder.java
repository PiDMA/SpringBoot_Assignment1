package com.comp3095.assignment1.security;

<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class PasswordEncoder {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
=======
public class PasswordEncoder {
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
}
