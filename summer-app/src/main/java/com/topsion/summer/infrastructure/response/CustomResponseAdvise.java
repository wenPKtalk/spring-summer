package com.topsion.summer.infrastructure.response;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class CustomResponseAdvise implements ResponseBodyAdvice<Object> {

    @Override
    @SuppressWarnings("unchecking")
    public boolean supports(MethodParameter returnType,
                            Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    @SuppressWarnings("unchecking")
    public Object beforeBodyWrite(Object body,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {
        if (methodParameter.getContainingClass().isAnnotationPresent(RestController.class)) {
            if (methodParameter.getMethod().isAnnotationPresent(IgnoreResponseBinding.class) == false) {
                if ((!(body instanceof ErrorResponse)) && (!(body instanceof SuccessResponse))) {
                    SuccessResponse<Object> objectSuccessResponse = new SuccessResponse<>(body);
                    return objectSuccessResponse;
                }

            }
        }
        return body;
    }
}
