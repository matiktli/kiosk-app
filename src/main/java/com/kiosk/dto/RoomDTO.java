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
public class RoomDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    @NotNull(message = "floor should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Integer floor;

    private LocationDTO location;
}
