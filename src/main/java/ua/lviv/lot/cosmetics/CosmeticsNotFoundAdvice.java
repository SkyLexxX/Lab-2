package ua.lviv.lot.cosmetics;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CosmeticsNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(CosmeticsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String cosmeticsNotFoundHandler(CosmeticsNotFoundException ex) {
        return ex.getMessage();
    }
}

