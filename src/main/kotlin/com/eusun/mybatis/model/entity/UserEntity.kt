package com.eusun.mybatis.model.entity

import com.eusun.mybatis.model.base.BaseEntity


data class UserEntity(var id: Long = 0, var name: String = "", var age: Int) : BaseEntity()