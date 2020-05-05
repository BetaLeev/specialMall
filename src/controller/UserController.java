package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import service.UserService;
import entity.UserEntity;

//@WebServlet("user")
public class UserController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//		Object id = req.getAttribute("id");

		UserService userService = new UserService();
		String url = req.getServletPath();
		if(url.endsWith("register.do")){
			UserEntity user = new UserEntity();
			user.setName(req.getParameter("name").toString());
			user.setPassword(req.getParameter("password").toString());
			user.setPhone(req.getParameter("phone").toString());
			userService.register(user);
			resp.getWriter().println("注册成功！");

			//TODO 添加新用户
		}else if(url.endsWith("login.do")){
			String result =   userService.login(req.getParameter("name"), req.getParameter("password"));
			//TOOD 登录
			resp.getWriter().println(result);

		}else if(url.endsWith("queryById.do")){
//			Object id = req.getAttribute("id");
	    	Object id = req.getParameter("id");
			UserEntity user =  userService.findUserById(Integer.parseInt(id.toString()));
			resp.getWriter().println(JSON.toJSONString(user));

			//TODO 根据ID查找用户
		}
	
//			 
//			  resp.getWriter().println(JSON.toString(user));
		resp.getWriter().println("Hello This is GET Response.");

//		 
			   
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//			resp.getWriter().println("Hello This is POST Response.");
	}

}
