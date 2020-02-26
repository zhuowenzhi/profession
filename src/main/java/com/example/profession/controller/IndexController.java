package com.example.profession.controller;

import com.example.profession.dto.PaginationDTO;
import com.example.profession.dto.QuestionDTO;
import com.example.profession.mapper.QuestionMapper;
import com.example.profession.mapper.UserMapper;
import com.example.profession.model.Question;
import com.example.profession.model.User;
import com.example.profession.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Author: zwz
 * Date: 2020/02/20
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "10") Integer size) {
        Cookie[] cookies = request.getCookies();
        if (cookies !=null && cookies.length !=0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user",user);
                    }
                    break;
                }
            }
        }

        PaginationDTO pagination = questionService.list(page, size);

        model.addAttribute("pagination", pagination);
        return "index";
    }

}
