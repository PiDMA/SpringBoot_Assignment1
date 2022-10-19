package com.comp3095.assignment1.model;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode

public class RegisterUser {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
