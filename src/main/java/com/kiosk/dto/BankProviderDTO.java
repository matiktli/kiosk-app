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
public class BankProviderDTO extends BaseDTO {

    @NotNull(message = "name should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String name;

    @NotNull(message = "overdraft should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Integer overdraft;

    @NotNull(message = "incentive should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private String incentive;

    @NotNull(message = "studentScore should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private Double studentScore;

    //@NotNull(message = "location should be present", groups = { CreateValidationGroup.class, UpdateValidationGroup.class })
    private LocationDTO location;
}
