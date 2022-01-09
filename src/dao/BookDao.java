package dao;

import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author WuGuochuan
 * @Date 2021-11-28 12:35
 */



public class BookDao {
    /**
     *@Description: 图书添加
     *@Author: WuGuochuan
     *@Date: 2021/11/28 12:36
     **/
    public int add(Connection con, Book book) throws Exception {
        String sql = "insert into t_book values(null,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, book.getBookName());
        ps.setString(2, book.getAuthor());
        ps.setString(3, book.getSex());
        ps.setFloat(4, book.getPrice());
        ps.setInt(5, book.getBookTypeId());
        ps.setString(6, book.getBookDesc());
        return ps.executeUpdate();
    }
  /**
  *@Description: 图书信息查询
      *@Author: WuGuochuan
      *@Date: 2021/11/28 12:46
   **/
    public ResultSet list(Connection con, Book book)throws Exception{
        StringBuffer sb=new StringBuffer("select * from t_book b,t_bookType bt where b.bookTypeId=bt.id");
        if(book.getBookName()!=null){
            sb.append(" and b.bookName like '%"+book.getBookName()+"%'");
        }
        if(book.getAuthor()!=null){
            sb.append(" and b.author like '%"+book.getAuthor()+"%'");
        }
        if(book.getBookTypeId()!=null && book.getBookTypeId()!=-1){
            sb.append(" and b.bookTypeId="+book.getBookTypeId());
        }
        PreparedStatement ps=con.prepareStatement(sb.toString());
        return ps.executeQuery();
    }
    /**
    *@Description: 图书信息删除
        *@Author: WuGuochuan
        *@Date: 2021/11/28 13:01
     **/
    public int delete(Connection con,String id)throws Exception{
        String sql="delete from t_book where id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, id);
        return ps.executeUpdate();
    }

   /**
   *@Description: 图书信息修改
       *@Author: WuGuochuan
       *@Date: 2021/11/28 13:05
    **/
    public int update(Connection con,Book book)throws Exception{
        String sql="update t_book set bookName=?,author=?,sex=?,price=?,bookDesc=?,bookTypeId=? where id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, book.getBookName());
        ps.setString(2, book.getAuthor());
        ps.setString(3, book.getSex());
        ps.setFloat(4, book.getPrice());
        ps.setString(5, book.getBookDesc());
        ps.setInt(6, book.getBookTypeId());
        ps.setInt(7, book.getId());
        return ps.executeUpdate();
    }


}
