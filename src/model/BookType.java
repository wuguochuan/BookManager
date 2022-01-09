package model;

/**
 * 图书类别
 * @author WuGuochuan
 * @Date 2021-11-26 19:20
 */
public class BookType {
    private int id;//编号
    private String bookTypeName;//图书类别名称
    private String bookTypeDesc;//图书类别描述

    public BookType() {
    }

    public BookType(String bookTypeName, String bookTypeDesc) {
        this.bookTypeName = bookTypeName;
        this.bookTypeDesc = bookTypeDesc;
    }

    public BookType(int id, String bookTypeName, String bookTypeDesc) {
        this.id = id;
        this.bookTypeName = bookTypeName;
        this.bookTypeDesc = bookTypeDesc;
    }

    public int getId() {
        return id;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public String getBookTypeDesc() {
        return bookTypeDesc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public void setBookTypeDesc(String bookTypeDesc) {
        this.bookTypeDesc = bookTypeDesc;
    }

    @Override
    public String toString() {
        return bookTypeName;
    }
}
