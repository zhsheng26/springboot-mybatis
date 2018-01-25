package com.eusun.mybatis.model.entity

import com.eusun.mybatis.model.base.BaseEntity
import org.apache.ibatis.type.Alias

@Alias("MiBlog")
data class MiBlogEntity(var id: String = "",
                        var title: String = "",
                        var content: String = "",
                        var userId: String = "") : BaseEntity()