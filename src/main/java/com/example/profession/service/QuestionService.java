package com.example.profession.service;

import com.example.profession.dto.QuestionDTO;
import com.example.profession.mapper.QuestionMapper;
import com.example.profession.mapper.UserMapper;
import com.example.profession.model.Question;
import com.example.profession.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zwz
 * @date : 2020/2/26 0026
 */
@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {

        List<Question> questions = questionMapper.list();

        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
           User user = userMapper.findById(question.getCreator());
           QuestionDTO  questionDTO= new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        return questionDTOList;
    }
}
