package cn.hospital.dao;

import cn.hospital.pojo.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}