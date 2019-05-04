package com.kiosk.dto;

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
public class DiscountDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    private String description;

    @NotNull(message = "startDate should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Timestamp startDate;

    @NotNull(message = "endDate should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Timestamp endDate;

    @NotNull(message = "organizator should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String organizator;

    private LocationDTO location;
}
