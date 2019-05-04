package com.kiosk.dto;

import com.kiosk.model.type.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO extends BaseDTO {

    private UserType type;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String studentNumber;

    private UserPersonalizationDTO userPersonalization;
}
