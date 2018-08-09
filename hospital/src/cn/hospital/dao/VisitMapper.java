package cn.hospital.dao;

import cn.hospital.pojo.Visit;

public interface VisitMapper {
    int deleteByPrimaryKey(Integer visitId);

    int insert(Visit record);

    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Integer visitId);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}