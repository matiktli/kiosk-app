package com.kiosk.dto;

import com.kiosk.model.type.EventType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventDTO extends BaseDTO {

    private String name;

    private EventType type;

    private Timestamp startDate;

    private Timestamp endDate;

    private String description;

    private LocationDTO location;
}
