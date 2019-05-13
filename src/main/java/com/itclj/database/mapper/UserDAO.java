package com.itclj.database.mapper;

import java.util.List;
import java.util.Map;
import com.itclj.database.entity.User;
import com.itclj.database.entity.UserBS;



public interface UserDAO {
	public int insert(User record);

	public int insertBS(UserBS record);

	public int insertSelective(User record);
    
	public int updateUser(User record);
	
	public int updateUserBS(UserBS record);
    
	public int deleteUser(User record);
    
	public int deleteUserBS(UserBS record);

	public List<User> getUserList(Map<String,Object> param);
    
	public List<UserBS> getUserListBS(Map<String,Object> param);

}