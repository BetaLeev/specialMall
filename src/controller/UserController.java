package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.UserEntity;

//@WebServlet("user")
public class UserController extends HttpServlet {
//	private UserService userService;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
//			 String id = req.getAttribute("id").toString();
//			  id = req.getParameter("id");
//			 UserEntity user =  userService.queryById(id);
//			 
		//	  resp.getWriter().println(JSON.toString(user));
//		resp.getWriter().println("Hello This is GET Response.");

//		 
			   
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//			resp.getWriter().println("Hello This is POST Response.");
	}

}
