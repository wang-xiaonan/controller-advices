package com.wxn.controlleradvices.advices;

import com.wxn.controlleradvices.exception.WrapperException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Component
public class ControllerAdvices {

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(RuntimeException e){
        System.out.println(e.getMessage());
        return "RuntimeExceptinn: 异常捕获";
    }

    @ResponseBody
    @ExceptionHandler(WrapperException.class)
    public String otherException(WrapperException e){
        System.out.println(e.getMessage());
        return "WrapperException: 异常捕获";
    }
}
