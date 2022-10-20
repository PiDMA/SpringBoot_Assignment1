package com.comp3095.assignment1.service;

<<<<<<< HEAD
import com.comp3095.assignment1.model.User;
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
import com.comp3095.assignment1.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserDetailsService {

    private final static String USER_NOT_FOUND =
            " User with email %s not found";
    private final UserRepository  userRepository;
<<<<<<< HEAD
    private BCryptPasswordEncoder bCryptPasswordEncoder;
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND,email)));
    }
<<<<<<< HEAD
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
=======
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
}
