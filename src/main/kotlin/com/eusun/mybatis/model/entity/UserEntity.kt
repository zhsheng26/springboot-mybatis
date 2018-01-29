package com.eusun.mybatis.model.entity

import com.eusun.mybatis.model.base.BaseEntity

data class UserEntity(
        var id: String = "",
        var name: String = "",
        var password: String = "") : BaseEntity()