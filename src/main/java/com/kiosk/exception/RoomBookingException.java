package com.kiosk.exception;

import com.kiosk.handler.ErrorUtils;

public class RoomBookingException extends BaseKioskException {

    public RoomBookingException(ErrorUtils.ErrorCodes internalCode) {
        super(internalCode);
    }

    public RoomBookingException() {
    }

    public RoomBookingException(String message) {
        super(message);
    }

    public RoomBookingException(String message, ErrorUtils.ErrorCodes internalCode) {
        super(message, internalCode);
    }

    public RoomBookingException(String message, ErrorUtils.ErrorCodes internalCode, Throwable throwable) {
        super(message, internalCode, throwable);
    }
}
