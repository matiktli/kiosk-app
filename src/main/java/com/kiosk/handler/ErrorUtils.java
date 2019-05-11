package com.kiosk.handler;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorUtils {

    public static final String MSG_PARAM_OBJECT_NOT_FOUND = "Object %s with id: [%s] not found";
    public static final String MSG_INSTANT_OBJECT_NOT_FOUND = "Object not found";

    public static final String MSG_PARAM_ROOM_NOT_AVAILABLE = "Room with id: [%s] is not available between [%s] and [%s]";
    public static final String MSG_INSTANT_ROOM_NOT_FOUND = "Room not existing for booking";

    @Getter
    public enum ErrorCodes {
        NOT_SPECIFIED(-1),
        DATABASE_ISSUE(1000);

        private int value;

        ErrorCodes(int internalErrorCode) {
            this.value = internalErrorCode;
        }
    }
}
