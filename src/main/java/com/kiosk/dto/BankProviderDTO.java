package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankProviderDTO extends BaseDTO {

    private String name;

    private Integer overdraft;

    private String incentive;

    private Double studentScore;

    private LocationDTO location;
}
