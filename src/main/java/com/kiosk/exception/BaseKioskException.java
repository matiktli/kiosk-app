package com.kiosk.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseKioskException extends RuntimeException {

    private int internalCode;

    public BaseKioskException(String message, Integer internalCode) {
        super(message);
        this.internalCode = internalCode;
    }

    public BaseKioskException(String message, Integer internalCode, Throwable throwable) {
        super(message, throwable);
        this.internalCode = internalCode;
    }
}
