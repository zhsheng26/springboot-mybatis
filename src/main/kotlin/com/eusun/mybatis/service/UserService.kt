package com.eusun.mybatis.service

import com.eusun.mybatis.mapper.UserMapper
import com.eusun.mybatis.model.entity.UserEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import javax.annotation.Resource

@Service
class UserService {
    @Resource
    private lateinit var userMapper: UserMapper

    @Transactional
    fun createUser(user: UserEntity): Boolean {
        return try {
            userMapper.insert(UUID.randomUUID().toString(), user.name, user.password)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun getUserById(uid: String): UserEntity? {
        return userMapper.findById(uid)
    }

    fun getUserByName(username: String): UserEntity? {
        return userMapper.findByName(username)
    }
}