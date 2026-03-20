package org.example.trainee.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(TraineeNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDTO handleException(TraineeNotFoundException e, HttpServletRequest request){
        return  new ErrorDTO(e.getMessage(), LocalDate.now(),request.getRequestURI());
    }
// there is field error
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String,ErrorDTO> handleException(MethodArgumentNotValidException e, HttpServletRequest request){
       List<ObjectError>error= e.getBindingResult().getAllErrors();
       Map<String,ErrorDTO> m = new HashMap<String,ErrorDTO>();
       for(ObjectError o: error){
           String fildName= ((FieldError)o).getField();
           m.put(fildName,new ErrorDTO(o.getDefaultMessage(),LocalDate.now(), request.getRequestURI()));
       }
       return m;
    }
// default other check
@ResponseBody
@ExceptionHandler(Exception.class)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public ErrorDTO Exception(TraineeNotFoundException e, HttpServletRequest request){
    return  new ErrorDTO(e.getMessage(), LocalDate.now(),request.getRequestURI());
}

}
