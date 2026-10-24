-- Create the database
CREATE DATABASE IF NOT EXISTS taskmanager_db;
USE taskmanager_db;

-- 1. Users Table
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role VARCHAR(30) NOT NULL -- e.g., Admin, Manager, Member
);

-- 2. Projects Table (Linked to Users via Foreign Key)
CREATE TABLE IF NOT EXISTS projects (
    project_id INT AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(100) NOT NULL,
    description TEXT,
    owner_id INT,
    status VARCHAR(30) NOT NULL, -- e.g., To-Do, In-Progress, Completed
    FOREIGN KEY (owner_id) REFERENCES users(user_id) ON DELETE SET NULL
);

-- 3. Tasks Table (Linked to Projects and Users via Foreign Keys)
CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    project_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    status VARCHAR(30) NOT NULL,    -- To-Do, In-Progress, Done
    priority VARCHAR(20) NOT NULL,  -- Low, Medium, High
    deadline DATE,
    assigned_to INT,
    FOREIGN KEY (project_id) REFERENCES projects(project_id) ON DELETE CASCADE,
    FOREIGN KEY (assigned_to) REFERENCES users(user_id) ON DELETE SET NULL
);