package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author WuGuochuan
 * @Date 2021-11-25 12:35
 */

public class UserDao {
    public User login(Connection con,User user)throws Exception{
        User resultUser=null;
        String sql="select * from t_user where userName=? and password=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getPassword());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            resultUser=new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassword(rs.getString("password"));
        }
        return resultUser;
    }
}
