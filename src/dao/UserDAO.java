package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.UserEntity;
import util.DaoUtil;

public class UserDAO {

	public UserEntity findUserByUsernamePassword(String username,
			String password) {
		Connection conn = DaoUtil.getConnection();
    	String s = "select * from user where name = "+"? AND "+"password=?";
        try {
            PreparedStatement pst=conn.prepareStatement(s);
			pst.setString(1, username);
			pst.setString(2, password);

		        //TODO 
		    
		    ResultSet result= pst.executeQuery();
			UserEntity user= new UserEntity();
			while(result.next()){
				user.setId(result.getInt("id"));
				user.setName(result.getString("name"));
				user.setPassword(result.getString("password"));
				user.setPhone(result.getString("phone"));
			}
		    return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
      return null;
	}

	public void updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		
	}
	
    /**
     * 连接数据库
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void insert (UserEntity userEntity) throws ClassNotFoundException, SQLException  {
 
        //2.获得数据库链接
        Connection conn= DaoUtil.getConnection();
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        String sql = ""+"insert into user(name,password,phone) values("+"?,?,?)";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1, userEntity.getName());
        pst.setString(2, userEntity.getPassword());
        pst.setString(3, userEntity.getPhone());

        pst.executeUpdate();        
        //关闭资源        
        pst.close();
       
    }
    public UserEntity selectUserById(Integer id) throws SQLException{
    	Connection conn = DaoUtil.getConnection();
    	String s = "select * from user where id = "+"?";
        PreparedStatement pst=conn.prepareStatement(s);
        pst.setInt(1, id);
          
        ResultSet result = pst.executeQuery();      
        //TODO 
        UserEntity user = new UserEntity();
        while(result.next()){
			user.setId(result.getInt("id"));
			user.setName(result.getString("name"));
			user.setPassword(result.getString("password"));
			user.setPhone(result.getString("phone"));
		}
        
        
        //关闭资源        
        pst.close();        
        return user;
    
    }
    
    public static void main(String[] args){
    	UserDAO userDao = new UserDAO();
    	UserEntity user = new UserEntity();
    	user.setName("xiaoming");
    	user.setPassword("123456");
    	try {
			userDao.insert(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
