package com.kiosk.exception;

import com.kiosk.handler.ErrorUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseKioskException extends RuntimeException {

    private ErrorUtils.ErrorCodes internalCode;

    public BaseKioskException(String message) {
        super(message);
        this.internalCode = ErrorUtils.ErrorCodes.NOT_SPECIFIED;
    }

    public BaseKioskException(String message,  ErrorUtils.ErrorCodes internalCode) {
        super(message);
        this.internalCode = internalCode;
    }

    public BaseKioskException(String message,  ErrorUtils.ErrorCodes internalCode, Throwable throwable) {
        super(message, throwable);
        this.internalCode = internalCode;
    }
}
