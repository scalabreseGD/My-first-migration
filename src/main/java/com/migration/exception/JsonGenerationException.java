package com.migration.exception;

public class JsonGenerationException extends RuntimeException {
    public JsonGenerationException(String message, Throwable cause) {
        super(message, cause);
    }
}
