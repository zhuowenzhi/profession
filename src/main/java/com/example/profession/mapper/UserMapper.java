package com.example.profession.mapper;
import com.example.profession.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : zwz
 * @date : 2020/2/20
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(account_id,name,token,gmt_create,gmt_modified) values(#{accountId),#{name},#{token},#{gmtCreate},#{gmtModified}")
    void insert(User user);

}
