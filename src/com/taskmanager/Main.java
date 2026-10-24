package com.taskmanager;

import com.taskmanager.dao.ProjectDao;
import com.taskmanager.dao.UserDao;
import com.taskmanager.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Task Manager Application...");
        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDao();
        ProjectDao projectDao = new ProjectDao();

        while (true) {
            System.out.println("\n--- Task Manager Menu ---");
            System.out.println("1. Register User");
            System.out.println("2. Create / Assign Project");
            System.out.println("3. View All Projects");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username (no spaces): ");
                    String username = scanner.nextLine().trim();
                    
                    if (username.contains(" ")) {
                        System.out.println("Error: Username cannot contain spaces!");
                        break;
                    }
                    
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Enter role (e.g., Admin/Employee): ");
                    String role = scanner.nextLine();

                    User newUser = new User(username, email, role);
                    boolean isRegistered = userDao.registerUser(newUser);

                    if (isRegistered) {
                        System.out.println("Success! User registered in the database.");
                    } else {
                        System.out.println("Failed to register user.");
                    }
                    break;

                case 2:
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    
                    System.out.print("Enter assigned User ID (owner ID): ");
                    int ownerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    System.out.print("Enter status (e.g., Pending, In Progress, Completed): ");
                    String status = scanner.nextLine();

                    boolean isCreated = projectDao.createProject(projectName, description, ownerId, status);

                    if (isCreated) {
                        System.out.println("Success! Project created and assigned.");
                    } else {
                        System.out.println("Failed to create project. Make sure the User ID exists!");
                    }
                    break;

                case 3:
                    projectDao.viewAllProjects();
                    break;

                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}