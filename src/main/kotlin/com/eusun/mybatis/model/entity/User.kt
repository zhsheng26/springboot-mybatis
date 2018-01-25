package com.eusun.mybatis.model.entity

import com.eusun.mybatis.model.base.BaseEntity

data class User(
        var id: String = "", var name: String = "", var age: Int = 0, var mobile: String = "") : BaseEntity()