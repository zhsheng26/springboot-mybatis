package com.eusun.mybatis.mapper;

import com.eusun.mybatis.model.entity.MiBlogEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MiBlogMapper {
    void insertMiBlog(MiBlogEntity miBlogEntity);
}
