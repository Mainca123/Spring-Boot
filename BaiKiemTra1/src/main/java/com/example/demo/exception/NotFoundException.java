package com.example.demo.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@Getter
@Setter
public class NotFoundException extends RuntimeException{
    private String message;
    private HttpStatus httpStatus;
    private long[] params;

    public NotFoundException(String message){
        super(message);
        this.httpStatus = HttpStatus.NOT_FOUND;
        this.params = new long[]{};
    }

    public NotFoundException(String message, HttpStatus httpStatus){
        super(message);
        this.params = new long[]{};
        this.httpStatus = httpStatus;
    }

    public NotFoundException(String message, long[] params){
        super(message);
        this.params = params;
        this.httpStatus = HttpStatus.NOT_FOUND;
    }

    public NotFoundException(String message, HttpStatus httpStatus, long[] params){
        super(message);
        this.httpStatus = httpStatus;
        this.params = params;
    }
}
