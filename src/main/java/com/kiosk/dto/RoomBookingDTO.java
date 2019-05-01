package com.kiosk.dto;

import com.kiosk.model.type.RoomBookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomBookingDTO extends BaseDTO {

    private RoomBookingType type;

    private RoomDTO room;

    private UserDTO user;

    private Timestamp startDate;

    private Timestamp endDate;
}
