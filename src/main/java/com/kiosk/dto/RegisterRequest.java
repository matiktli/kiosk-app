package com.kiosk.dto;

import com.kiosk.model.type.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {

    @NotNull(message = "firstName should not be empty.")
    private String firstName;

    @NotNull(message = "lastName should not be empty.")
    private String lastName;

    @NotNull(message = "email should not be empty.")
    private String email;

    @NotNull(message = "password should not be empty.")
    private String password;

    private UserType userType = UserType.USER;

    private String studentNumber = null;
}
