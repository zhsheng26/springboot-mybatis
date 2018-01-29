package com.eusun.mybatis.config

import com.github.pagehelper.PageHelper
import org.mybatis.spring.annotation.MapperScan
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@MapperScan("com.eusun.mybatis.mapper")
class MyBatisConfiguration {
    private val log = LoggerFactory.getLogger(MyBatisConfiguration::class.java)
    @Bean
    fun pageHelper(): PageHelper {
        log.info("------Register MyBatis PageHelper")
        val pageHelper = PageHelper()
        val p = Properties()
        p.setProperty("offsetAsPageNum", "true")
        p.setProperty("rowBoundsWithCount", "true")
        p.setProperty("reasonable", "true")
        //通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
        p.setProperty("pageSizeZero", "true")
        p.setProperty("helperDialect", "mysql")    //配置mysql数据库的方言
        pageHelper.setProperties(p)
        return pageHelper
    }
}