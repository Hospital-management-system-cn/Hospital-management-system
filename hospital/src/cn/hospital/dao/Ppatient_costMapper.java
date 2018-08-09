package cn.hospital.dao;

import cn.hospital.pojo.Ppatient_cost;

public interface Ppatient_costMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ppatient_cost record);

    int insertSelective(Ppatient_cost record);

    Ppatient_cost selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ppatient_cost record);

    int updateByPrimaryKey(Ppatient_cost record);
}