package com.comp3095.assignment1.service;

import com.comp3095.assignment1.model.User;
import com.comp3095.assignment1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserDetailsService {

    private final static String USER_NOT_FOUND =
            " User with email %s not found";
    private final UserRepository  userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND,email)));
    }
    public  String signUpUser(User user){
       boolean userExists = userRepository.findByEmail(user.getEmail())
                .isPresent();
       if(userExists){
           throw new IllegalStateException("email already taken");
       }
      String encodedPassword=  bCryptPasswordEncoder
              .encode(user.getPassword());
       user.setPassword(encodedPassword);


         userRepository.save(user);
         return "it Works";
    }
}
