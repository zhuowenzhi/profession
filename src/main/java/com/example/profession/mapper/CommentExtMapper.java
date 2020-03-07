package com.example.profession.mapper;

import com.example.profession.model.Comment;
import com.example.profession.model.CommentExample;
import com.example.profession.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}