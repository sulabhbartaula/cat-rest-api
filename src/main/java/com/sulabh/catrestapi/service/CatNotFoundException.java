package com.sulabh.catrestapi.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cat Not Found")
public class CatNotFoundException extends RuntimeException{

    public CatNotFoundException(){

    }

    public CatNotFoundException(String message){
        super(message);
    }
}
