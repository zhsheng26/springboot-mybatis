package com.eusun.mybatis.repository

import com.eusun.mybatis.model.entity.UserEntity
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface UserMapper {

    @Select("SELECT * FROM UserEntity WHERE NAME = #{name}")
    fun findByName(@Param("name") name: String): UserEntity

    @Insert("INSERT INTO UserEntity(NAME, AGE) VALUES(#{name}, #{age})")
    fun insert(@Param("name") name: String, @Param("age") age: Int?): Int

}