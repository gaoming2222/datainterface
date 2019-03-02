package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.User;



public interface UserDAO {
    int insert(User record);

    int insertSelective(User record);
    
    int updateUser(User record);
    
    int deleteUser(User record);
    
    List<User> getUserList(Map<String,Object> param);
    
    
}