package com.comp3095.assignment1.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Data
@Builder
<<<<<<< HEAD
@Table(name = "\"user\"")
=======

>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
<<<<<<< HEAD
    private String firstName;
    private String lastName;
=======
    private String name;
    private String userName;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;



<<<<<<< HEAD

    public User(String firstName, String lastName, String email, String password, AppUserRole appUserRole) {
        this.firstName = firstName;
        this.lastName = lastName;
=======
    public User(String name, String userName, String email, String password, AppUserRole appUserRole) {
        this.name = name;
        this.userName = userName;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
        this.email = email;
        this.password = password;
        this.appUserRole = appUserRole;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority=
                new SimpleGrantedAuthority(appUserRole.name());
        return Collections.singletonList(authority);
    }
<<<<<<< HEAD
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
=======

>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
<<<<<<< HEAD
        return email;
=======
        return userName;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
<<<<<<< HEAD
        return true;
=======
        return false;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    }

    @Override
    public boolean isCredentialsNonExpired() {
<<<<<<< HEAD
        return true;
=======
        return false;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    }

    @Override
    public boolean isEnabled() {
<<<<<<< HEAD
        return true;
=======
        return false;
>>>>>>> 75b3fc6ad5a559c1fdfdb3cc8be9aa1239df6ea1
    }


}
