package com.example.profession.controller;

import com.example.profession.dto.QuestionDTO;
import com.example.profession.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : zwz
 * @date : 2020/2/27 0027
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model) {
        QuestionDTO questionDTO = questionService.getById(id);

        //增加阅读数
       questionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
