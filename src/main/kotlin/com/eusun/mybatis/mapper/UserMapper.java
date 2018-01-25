package com.eusun.mybatis.mapper;

import com.eusun.mybatis.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM user WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO user(ID,NAME, AGE) VALUES(#{id},#{name}, #{age})")
    int insert(@Param("id") String id, @Param("name") String name, @Param("age") int age);
}
