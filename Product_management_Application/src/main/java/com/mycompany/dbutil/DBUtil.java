package com.mycompany.dbutil;
/*  dbUtil - Database connection classes, useful for jdbc connection*/
import java.sql.*;

public class DBUtil {

    //static method that creates a connection to the database and return the connection object
    public static Connection getConnection()
    {
        Connection conn = null;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/products", "root", "Yogesh@9211");
           
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    //close connection
    public static void closeConnection(Connection conn)
    {
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}