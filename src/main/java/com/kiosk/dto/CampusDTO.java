package com.kiosk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampusDTO extends BaseDTO {

    private String name;

    private String description;

    private String contact;

    private LocationDTO location;
}
