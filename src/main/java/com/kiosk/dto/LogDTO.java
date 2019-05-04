package com.kiosk.dto;

import com.kiosk.model.type.LogActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    private UserDTO user;

    @NotNull(message = "timestamp should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Timestamp timestamp;

    @NotNull(message = "type should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private LogActionType type;

    private String action;
}
