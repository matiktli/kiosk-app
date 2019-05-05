package com.kiosk.exception;

import com.kiosk.handler.ErrorUtils;

public class ObjectNotFoundException extends BaseKioskException {

    public ObjectNotFoundException(ErrorUtils.ErrorCodes internalCode) {
        super(internalCode);
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, ErrorUtils.ErrorCodes internalCode) {
        super(message, internalCode);
    }

    public ObjectNotFoundException(String message, ErrorUtils.ErrorCodes internalCode, Throwable throwable) {
        super(message, internalCode, throwable);
    }
}
