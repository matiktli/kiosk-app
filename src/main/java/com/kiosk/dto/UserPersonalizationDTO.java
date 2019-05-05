package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPersonalizationDTO extends BaseDTO {

    @NotNull(message = "favEventTypes should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private List<String> favEventTypes = new ArrayList<>();
}
