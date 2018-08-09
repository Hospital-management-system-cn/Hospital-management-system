package cn.hospital.dao;

import cn.hospital.pojo.Inspect;

public interface InspectMapper {
    int deleteByPrimaryKey(Integer inspectId);

    int insert(Inspect record);

    int insertSelective(Inspect record);

    Inspect selectByPrimaryKey(Integer inspectId);

    int updateByPrimaryKeySelective(Inspect record);

    int updateByPrimaryKey(Inspect record);
}