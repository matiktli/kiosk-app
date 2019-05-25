package com.kiosk.dto;

import com.kiosk.model.type.EventType;
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
public class EventDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    @NotNull(message = "type should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private EventType type;

    @NotNull(message = "startDate should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Timestamp startDate;

    @NotNull(message = "endDate should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Timestamp endDate;

    private String description;

    private Integer locationId;
}
