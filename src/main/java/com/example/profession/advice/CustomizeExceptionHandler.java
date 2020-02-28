package com.example.profession.advice;

import com.example.profession.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author : zwz
 * @date : 2020/2/28 0028
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e,
                        Model model) {

            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message","哦哦，服务器崩溃了！！！");
            }

            return new ModelAndView("error");
        }
}
