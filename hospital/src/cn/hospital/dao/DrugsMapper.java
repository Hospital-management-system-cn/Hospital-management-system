package cn.hospital.dao;

import cn.hospital.pojo.Drugs;

public interface DrugsMapper {
    int deleteByPrimaryKey(Integer drugsId);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    Drugs selectByPrimaryKey(Integer drugsId);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
}