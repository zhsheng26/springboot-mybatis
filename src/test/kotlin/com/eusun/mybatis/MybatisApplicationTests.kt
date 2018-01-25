package com.eusun.mybatis

import com.eusun.mybatis.mapper.UserMapper
import org.apache.ibatis.session.SqlSessionFactory
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    lateinit var userMapper: UserMapper
    @Autowired
    lateinit var sqlSessionFactory: SqlSessionFactory

    @Test
    fun testUserMapper() {
//        userMapper.insert(UUID.randomUUID().toString(), "andy", 12)
        val mapper = sqlSessionFactory.openSession().getMapper(UserMapper::class.java)
        val findByName = mapper.findByName("andy")

        Assert.assertNotNull(findByName)

    }
}
