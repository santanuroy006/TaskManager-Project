package com.taskmanager.dao;

import java.sql.*;

public class ProjectDao {

    // Method for Admin to assign a project to a user (owner_id)
    public boolean createProject(String projectName, String description, int ownerId, String status) {
        String query = "INSERT INTO projects (project_name, description, owner_id, status) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, projectName);
            pstmt.setString(2, description);
            pstmt.setInt(3, ownerId);
            pstmt.setString(4, status);
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to view all projects and their statuses
    public void viewAllProjects() {
        String query = "SELECT p.project_id, p.project_name, p.description, p.status, u.username AS owner " +
                       "FROM projects p LEFT JOIN users u ON p.owner_id = u.user_id";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n--- Project List ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("project_id") + 
                                   " | Project: " + rs.getString("project_name") + 
                                   " | Assigned To: " + rs.getString("owner") + 
                                   " | Status: " + rs.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}