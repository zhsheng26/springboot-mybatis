package com.eusun.mybatis.config

import com.github.pagehelper.PageHelper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
class MyBatisConfiguration {
    @Bean
    fun pageHelper(): PageHelper {
        val pageHelper = PageHelper()
        val p = Properties()
        p.setProperty("offsetAsPageNum", "true")
        p.setProperty("rowBoundsWithCount", "true")
        p.setProperty("reasonable", "true")
        pageHelper.setProperties(p)
        return pageHelper
    }
}