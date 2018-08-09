package cn.hospital.dao;

import cn.hospital.pojo.Provincial;

public interface ProvincialMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Provincial record);

    int insertSelective(Provincial record);

    Provincial selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Provincial record);

    int updateByPrimaryKey(Provincial record);
}