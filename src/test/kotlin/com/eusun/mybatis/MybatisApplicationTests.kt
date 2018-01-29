package com.eusun.mybatis

import com.eusun.mybatis.mapper.MiBlogMapper
import com.eusun.mybatis.mapper.UserMapper
import com.eusun.mybatis.model.entity.MiBlogEntity
import org.apache.ibatis.session.SqlSessionFactory
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*


@RunWith(SpringRunner::class)
@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    lateinit var userMapper: UserMapper
    @Autowired
    lateinit var sqlSessionFactory: SqlSessionFactory
    @Autowired
    lateinit var miBlogMapper: MiBlogMapper

    @Test
    fun testUserMapper() {
        userMapper.insert(UUID.randomUUID().toString(), "andy3", "111")
//        val mapper = sqlSessionFactory.openSession().getMapper(UserMapper::class.java)
//        val findByName = mapper.findByName("andy")
//        Assert.assertNotNull(findByName)
    }

    @Test
    fun testFromPageable() {
        val size = 2
        val list = userMapper.findAllFromPage(1, size)
        list.forEach {
            print(it)
        }
        Assert.assertEquals(size, list.size)
    }

    @Test
    fun testMiBlogMapper() {
        miBlogMapper.insertMiBlog(MiBlogEntity(id = UUID.randomUUID().toString(), title = "hell", content = "name"))

    }
}
