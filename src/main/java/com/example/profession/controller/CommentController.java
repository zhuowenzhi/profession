package com.example.profession.controller;

import com.example.profession.dto.CommentCreateDTO;
import com.example.profession.dto.ResultDTO;
import com.example.profession.exception.CustomizeErrorCode;
import com.example.profession.exception.CustomizeException;
import com.example.profession.mapper.CommentMapper;
import com.example.profession.model.Comment;
import com.example.profession.model.User;
import com.example.profession.service.CommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : zwz
 * @date : 2020/3/3 0003
 */
@Controller
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentCreateDTO commentCreateDTO,
                       HttpServletRequest request) {

        User user =(User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(new CustomizeException(CustomizeErrorCode.NO_LOGIN));
        }

        if (commentCreateDTO == null || StringUtils.isBlank(commentCreateDTO.getContent())) {
            return ResultDTO.errorOf(new CustomizeException(CustomizeErrorCode.CONTENT_IS_EMPTY));

        }
        Comment comment = new Comment();
        comment.setParentId(commentCreateDTO.getParentId());
        comment.setContent(commentCreateDTO.getContent());
        comment.setType(commentCreateDTO.getType());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
}
