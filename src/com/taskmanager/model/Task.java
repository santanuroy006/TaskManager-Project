package com.taskmanager.model;

import java.time.LocalDate;

public class Task {
    private int taskId;
    private int projectId;
    private String title;
    private String description;
    private String status; // To-Do, In-Progress, Done
    private String priority; // Low, Medium, High
    private LocalDate deadline;
    private int assignedTo; // User ID

    // Constructor
    public Task(int taskId, int projectId, String title, String description, String status, String priority, LocalDate deadline, int assignedTo) {
        this.taskId = taskId;
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
        this.assignedTo = assignedTo;
    }

    // Getters and Setters (Encapsulation)
    public int getTaskId() { return taskId; }
    public void setTaskId(int taskId) { this.taskId = taskId; }

    public int getProjectId() { return projectId; }
    public void setProjectId(int projectId) { this.projectId = projectId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public int getAssignedTo() { return assignedTo; }
    public void setAssignedTo(int assignedTo) { this.assignedTo = assignedTo; }

    @Override
    public String toString() {
        return "Task{id=" + taskId + ", title='" + title + "', status='" + status + "', priority='" + priority + "'}";
    }
}