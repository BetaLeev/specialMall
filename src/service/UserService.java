package service;

import java.sql.SQLException;

import com.alibaba.fastjson.JSON;

import dao.UserDAO;
import entity.UserEntity;

public class UserService {

	
	
	public void register(UserEntity user){
		
		try {
			UserDAO userDao = new UserDAO();

			//往数据库添加用户
			userDao.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String login(String username,String password){
		
		UserDAO userDao = new UserDAO();

		//1.查询
		UserEntity user = userDao.findUserByUsernamePassword(username, password);
		
		//2.判断
		if(user == null){
			//TODO ("用户名或者密码不正确");
		}
		

		return JSON.toJSONString(user);
	}
	
	public UserEntity findUserById(Integer id){
		try {
			UserDAO userDao = new UserDAO();

			//1.查询
			UserEntity user = userDao.selectUserById(id);
			//2.判断
			if(user == null){
//				throw new UserException("用户名不存在");
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
//			throw new UserException("未知错误");
		}
		return null;
	}
	
	public void modifyUserInfo(UserEntity user){
		try {
			UserDAO userDao = new UserDAO();

			userDao.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

