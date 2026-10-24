package com.taskmanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Update these with your local MySQL username and password
    private static final String URL = "jdbc:mysql://localhost:3306/taskmanager_db";
    private static final String USER = "root";
    private static final String PASSWORD = "#743248skRoy"; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        return connection;
    }
}