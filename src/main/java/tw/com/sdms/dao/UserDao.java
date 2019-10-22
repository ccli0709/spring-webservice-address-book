package tw.com.sdms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tw.com.sdms.bean.User;

@Mapper
public interface UserDao {

	 List<User> findAllUser();
	
}
