package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountDTO extends BaseDTO {

    private String name;

    private String description;

    private Timestamp startDate;

    private Timestamp endDate;

    private String organizator;

    private LocationDTO location;
}
