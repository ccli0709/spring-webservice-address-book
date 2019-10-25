package tw.com.sdms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.sdms.model.Tbdu01;
import tw.com.sdms.service.UserService;

	
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/all_tbdu01")
	public List<Tbdu01> selectAllTbdu01() {
		return userService.selectAllTbdu01();
	}
}
