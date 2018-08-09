package cn.hospital.dao;

import cn.hospital.pojo.Pepar;

public interface PeparMapper {
    int deleteByPrimaryKey(Integer peparId);

    int insert(Pepar record);

    int insertSelective(Pepar record);

    Pepar selectByPrimaryKey(Integer peparId);

    int updateByPrimaryKeySelective(Pepar record);

    int updateByPrimaryKey(Pepar record);
}