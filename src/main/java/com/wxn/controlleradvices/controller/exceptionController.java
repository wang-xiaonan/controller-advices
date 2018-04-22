package com.wxn.controlleradvices.controller;

import com.wxn.controlleradvices.exception.WrapperException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/exception")
class ExceptionController {

    @ResponseBody
    @RequestMapping(value = "/throw/runtime", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    public String testAdvices(){
        if (true)
        throw new RuntimeException("RuntimeException异常");
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/throw/wrapper", produces = "application/json;charset=utf-8", method = RequestMethod.GET)
    public String wrapperAdvices(){
        if (true)
            throw new WrapperException("WrapperException异常");
        return "success";
    }
}
