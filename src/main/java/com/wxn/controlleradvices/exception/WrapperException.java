package com.wxn.controlleradvices.exception;

public class WrapperException extends RuntimeException {
    public WrapperException() {
        super();
    }

    public WrapperException(String message) {
        super(message);
    }
}
