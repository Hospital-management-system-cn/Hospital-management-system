package cn.hospital.dao;

import cn.hospital.pojo.User_sal;

public interface User_salMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_sal record);

    int insertSelective(User_sal record);

    User_sal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_sal record);

    int updateByPrimaryKey(User_sal record);
}