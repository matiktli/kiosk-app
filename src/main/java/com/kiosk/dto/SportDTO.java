package com.kiosk.dto;

import com.kiosk.model.type.SportType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SportDTO extends BaseDTO {

    private SportType type;

    private String name;

    private String trainingTimes;

    private String description;

    private LocationDTO location;
}
