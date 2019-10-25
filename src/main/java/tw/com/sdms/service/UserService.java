package tw.com.sdms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.sdms.mapper.Tbdu01Mapper;
import tw.com.sdms.model.Tbdu01;

@Service
public class UserService {

	@Autowired
	private Tbdu01Mapper tbdu01Mapper;

	/**
	 * 查找所有用户
	 */
	public List<Tbdu01> selectAllTbdu01() {
		return tbdu01Mapper.selectAll();
	}
}