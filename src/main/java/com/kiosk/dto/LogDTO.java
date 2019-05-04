package com.kiosk.dto;

import com.kiosk.model.type.LogActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogDTO extends BaseDTO {

    private String name;

    private UserDTO user;

    private Timestamp timestamp;

    private LogActionType type;

    private String action;
}
