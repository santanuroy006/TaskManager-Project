package com.taskmanager.model;

public class User {
    private int userId;
    private String username;
    private String email;
    private String role; // e.g., Admin, Manager, Member

    // Constructor
    public User(String username, String email, String role) {
    this.username = username;
    this.email = email;
    this.role = role;
}

    // Getters and Setters (Encapsulation)
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "User{id=" + userId + ", name='" + username + "', role='" + role + "'}";
    }
}