package com.example.profession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.View;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView greeting(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return new ModelAndView("hello");
    }
}
