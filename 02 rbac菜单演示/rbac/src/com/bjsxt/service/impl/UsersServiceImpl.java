package com.bjsxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.MenuService;
import com.bjsxt.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	@Resource
	private MenuService menuServiceImpl;
	
	@Override
	public Users login(Users users) {
		Users user = usersMapper.selByUser(users);
		user.setMenus(menuServiceImpl.showMenu(user.getRid()));
		return user;
	}

}
