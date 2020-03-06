package com.example.profession.controller;

import com.example.profession.dto.CommentDTO;
import com.example.profession.dto.QuestionDTO;
import com.example.profession.service.CommentService;
import com.example.profession.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author : zwz
 * @date : 2020/2/27 0027
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model) {
        QuestionDTO questionDTO = questionService.getById(id);

        List<CommentDTO> comments = commentService.listByQuestionId(id);


        //增加阅读数
       questionService.incView(id);

        System.out.println("questionDTO==============");
        System.out.println(questionDTO);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }
}
