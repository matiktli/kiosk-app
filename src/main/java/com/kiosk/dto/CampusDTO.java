package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampusDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    //@NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String description;

    @NotNull(message = "contact should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String contact;

    //@NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private LocationDTO location;
}
