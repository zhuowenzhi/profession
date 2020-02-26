package com.example.profession.mapper;

import com.example.profession.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : zwz
 * @date : 2020/2/24 0024
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title, description, gmt_create, gmt_modified, creator, tags) values (#{title},#{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tags})")
    void create(Question question);
}
