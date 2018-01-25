package com.eusun.mybatis.model.entity

import com.eusun.mybatis.model.base.BaseEntity

data class MiBlogEntity(var id: String = "",
                        var title: String = "",
                        var content: String = "",
                        var userId: String = "") : BaseEntity()