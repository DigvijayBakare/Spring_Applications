package com.springmvcsearch.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {
    // Handling exception in the spring mcx
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    public String exceptionHandler(Model model) {
        model.addAttribute("msg", "Null pointer or Number Format exception occurred!!");
        return "errorPage";
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public String genericExceptionHandler(Model model) {
        model.addAttribute("msg", "Exception occurred!!");
        return "errorPage";
    }
}
