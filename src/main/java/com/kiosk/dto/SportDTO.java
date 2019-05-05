package com.kiosk.dto;

import com.kiosk.model.type.SportType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SportDTO extends BaseDTO {

    @NotNull(message = "type should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private SportType type;

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    @NotNull(message = "trainingTimes should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String trainingTimes;

    private String description;

    private LocationDTO location;
}
