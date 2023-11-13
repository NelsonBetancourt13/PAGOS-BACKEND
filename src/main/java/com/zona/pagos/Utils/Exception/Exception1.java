package com.zona.pagos.Utils.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class Exception1 extends Exception{

    public Exception1(String message){
        super(message);
    }
}
