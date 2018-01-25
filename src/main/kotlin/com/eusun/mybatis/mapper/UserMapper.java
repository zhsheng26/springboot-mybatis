package com.eusun.mybatis.mapper;

import com.eusun.mybatis.model.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE name = #{name}")
    UserEntity findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(id,name,age) VALUES(#{id},#{name}, #{age})")
    int insert(@Param("id") String id, @Param("name") String name, @Param("age") int age);
}
