package com.filterMVC.handlers;

import com.filterMVC.exception.FirstTestException;
import com.filterMVC.exception.MainTestException;
import com.filterMVC.exception.SecondTestException;
import com.filterMVC.exception.ThirdTestException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FirstTestHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FirstTestException.class)
    public ResponseEntity handlerFirstException(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "first Test exception", new HttpHeaders(), HttpStatus.FORBIDDEN, request);
    }

    @ExceptionHandler(MainTestException.class)
    public ResponseEntity handleGroupException(Exception ex, WebRequest request) {
        String message = "";
        if (ex.getClass().equals(SecondTestException.class))
            message = "second exception";
        if (ex.getClass().equals(ThirdTestException.class))
            message = "third exception";

        return handleExceptionInternal(ex, message, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(SecondTestException.class)
        public ResponseEntity SecondException(Exception ex, WebRequest request){
            return handleExceptionInternal(ex, "second individual exception", new HttpHeaders(),HttpStatus.CONFLICT, request);
        }
    }

