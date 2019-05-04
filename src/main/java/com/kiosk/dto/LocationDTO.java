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
public class LocationDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    @NotNull(message = "latitude should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Double latitude;

    @NotNull(message = "longitude should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Double longitude;

    private String description;
}
