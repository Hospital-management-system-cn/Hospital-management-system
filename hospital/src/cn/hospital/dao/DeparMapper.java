package cn.hospital.dao;

import cn.hospital.pojo.Depar;

public interface DeparMapper {
    int deleteByPrimaryKey(Integer deparId);

    int insert(Depar record);

    int insertSelective(Depar record);

    Depar selectByPrimaryKey(Integer deparId);

    int updateByPrimaryKeySelective(Depar record);

    int updateByPrimaryKey(Depar record);
}