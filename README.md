Java Task Manager Backend

A console-based Task Management application built using Java, JDBC, and MySQL for managing user accounts and assigned projects efficiently.

🚀 Features
 1. User Management: Register and securely handle user profiles.
 2. Project Tracking: Create, assign, and view all active projects.
 3. Database Integration: Direct and efficient database operations using JDBC and MySQL.

🛠️ Tech Stack
 1. Language: Java
 2. Database: MySQL
 3. Connectivity: JDBC (Java Database Connectivity)
 4. IDE: Visual Studio Code

📂 Project Structure
 1. src/com/taskmanager/model/ - Contains entity classes (User, Task, Project).
 2. src/com/taskmanager/dao/ - Data Access Objects handling database queries and logic.
 3. src/com/taskmanager/DatabaseConnection.java - Manages the MySQL database connection.
 4. src/com/taskmanager/Main.java - Main entry point with the console menu.
 5. schema.sql - Database schema and table creation queries.

⚙️ Setup & Installation
 1. Clone the repository:
   git clone https://github.com/santanu006/TaskManager-Project.git

 2. Import the database schema from schema.sql into your MySQL server.
 3. Configure your database credentials in DatabaseConnection.java.
 4. Run Main.java to start the application.
    
