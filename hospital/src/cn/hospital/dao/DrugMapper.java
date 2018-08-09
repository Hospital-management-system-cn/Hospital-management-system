package cn.hospital.dao;

import cn.hospital.pojo.Drug;

public interface DrugMapper {
    int deleteByPrimaryKey(Integer drugId);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(Integer drugId);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}