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
public class UserDTO extends BaseDTO {

    @NotNull(message = "type should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private UserType type;

    @NotNull(message = "firstName should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String firstName;

    @NotNull(message = "lastName should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String lastName;

    @NotNull(message = "email should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String email;

    @NotNull(message = "password should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String password;

    private String studentNumber;

    private UserPersonalizationDTO userPersonalization = null;
}
