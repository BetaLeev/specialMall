package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.UserEntity;
import util.DaoUtil;

public class UserDAo {
	
//    连接数据库
//    public void insert () throws ClassNotFoundException, SQLException  {
// 
//        //2.获得数据库链接
//        Connection conn= DaoUtil.getConnection();
//        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
//        String s=""+"insert into user(id,user_name,user_password) values("+"2,?,123)";
//        java.sql.PreparedStatement pst=conn.prepareStatement(s);
//        
//        pst.setString(1, "xiaoshuai1");
//        //pst.setString(2, "123");
//            
//        pst.execute();        
//        //关闭资源        
//        pst.close();
//        conn.close();
//    }
//    public UserEntity selectUserById(Integer id) throws SQLException{
//    	Connection conn = DaoUtil.getConnection();
//    	String s = "select * from user where id = "+"?";
//        PreparedStatement pst=conn.prepareStatement(s);
//        pst.setString(1, "id");
//          
//        ResultSet rs = pst.executeQuery();      
//        //TODO 
//        UserEntity user = new UserEntity();
//        user.setId(rs.getInt("id"));
//        user.setName(rs.getString("name"));
//        
//        
//        //关闭资源        
//        pst.close();
//        conn.close();
//        
//        return user;
//    
//    }
//    
//    public void updateById(){}
//    
//   public void deleteById(){
//////   	Connection conn = DaoUtil.getConnection();
//////   	
////    java.sql.PreparedStatement pst=conn.preptareStatement(s);
//   }
}
