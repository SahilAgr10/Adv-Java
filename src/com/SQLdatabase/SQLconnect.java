package com.SQLdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLconnect {
    //jdbc Demo

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String user="root";
        String pass= "1234";
        String url = "jdbc:mysql://127.0.0.1:3306/super30";

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,pass);
        System.out.println("Connecting with mysql..");

    }
}
