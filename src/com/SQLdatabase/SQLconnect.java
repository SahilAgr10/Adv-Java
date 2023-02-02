package com.SQLdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLconnect {
    //jdbc Demo

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String user="root";
        String pass= "Sahil@4994";
        String url = "jdbc:mysql://127.0.0.1:3306/super30";
        String string = " insert into tblemployee values(103,'rohit','pune',94000)";

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,pass);
        Statement statement = connection.createStatement();
        statement.execute(string);
        System.out.println("Connecting with mysql..");

    }
}
