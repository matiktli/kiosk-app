package com.kiosk.handler;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorUtils {

    public static final String MSG_PARAM_OBJECT_NOT_FOUND = "Object %s with id: [%s] not found";


    public static final String MSG_INSTANT = "Object not found";


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
