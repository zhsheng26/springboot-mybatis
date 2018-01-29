package com.eusun.mybatis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class MybatisApplication

fun main(args: Array<String>) {
    SpringApplication.run(MybatisApplication::class.java, *args)
}
