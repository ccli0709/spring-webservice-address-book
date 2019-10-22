package tw.com.sdms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.sdms.bean.Tbdu01;
import tw.com.sdms.bean.User;
import tw.com.sdms.dao.Tbdu01Mapper;
import tw.com.sdms.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	@Autowired
	private Tbdu01Mapper tbdu01Mapper;

	/**
	 * 查找所有用户
	 */
	public List<User> selectAllUser() {
		return userDao.findAllUser();
	}

	/**
	 * 查找所有用户
	 */
	public List<Tbdu01> selectAllTbdu01() {
		return tbdu01Mapper.selectAll();
	}
}
