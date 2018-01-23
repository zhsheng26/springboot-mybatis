package com.eusun.mybatis

import com.eusun.mybatis.repository.UserMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.Resource

@SpringBootApplication
class MybatisApplication

@Resource
lateinit var userMapper: UserMapper

fun main(args: Array<String>) {
    SpringApplication.run(MybatisApplication::class.java, *args)
}
