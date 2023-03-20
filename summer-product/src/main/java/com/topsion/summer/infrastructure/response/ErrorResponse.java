package com.topsion.summer.infrastructure.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse<T> {
    private ErrorDTO<T> error;

    public ErrorResponse(T object, String message) {
        this.error = new ErrorDTO<>(object, message);
    }

    public ErrorDTO<T> getError() {
        return error;
    }

    public void setError(ErrorDTO<T> error) {
        this.error = error;
    }
}
