package com.kiosk.exception;

import com.kiosk.handler.ErrorUtils;

public class SecurityException extends BaseKioskException {

    public SecurityException(ErrorUtils.ErrorCodes internalCode) {
        super(internalCode);
    }

    public SecurityException() {
    }

    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(String message, ErrorUtils.ErrorCodes internalCode) {
        super(message, internalCode);
    }

    public SecurityException(String message, ErrorUtils.ErrorCodes internalCode, Throwable throwable) {
        super(message, internalCode, throwable);
    }
}
