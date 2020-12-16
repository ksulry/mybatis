package com.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/27  9:25
 */
@ControllerAdvice
public class ExceptionController {
   @ExceptionHandler(BindException.class)
   @ResponseBody
    public Map constrauntViolationHandler(BindException bindException){
       List<ObjectError> errors = bindException.getBindingResult().getAllErrors();
       Map<String,Object> respMap = new HashMap<>();
       respMap.put("code", HttpStatus.BAD_REQUEST.value());
       respMap.put("msg",errors);
       return respMap;
   }
}
