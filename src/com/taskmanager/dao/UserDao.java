package com.taskmanager.dao;

import com.taskmanager.model.User;
import java.sql.*;

public class UserDao {

    // Method to insert a new user into the database
    public boolean registerUser(User user) {
        String query = "INSERT INTO users (username, email, role) VALUES (?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getRole());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } 
        catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                System.out.println("Error: Username or Email already exists!");
            } 
            else {
                e.printStackTrace();
            }
            return false;
        }
    }
}