package com.taskmanager.model;

public class Project {
    private int projectId;
    private String projectName;
    private String description;
    private int ownerId; // Foreign Key referencing the User who owns the project
    private String status; // e.g., To-Do, In-Progress, Completed

    // Constructor
    public Project(int projectId, String projectName, String description, int ownerId, String status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.ownerId = ownerId;
        this.status = status;
    }

    // Getters and Setters (Encapsulation)
    public int getProjectId() { return projectId; }
    public void setProjectId(int projectId) { this.projectId = projectId; }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Project{id=" + projectId + ", name='" + projectName + "', status='" + status + "'}";
    }
}