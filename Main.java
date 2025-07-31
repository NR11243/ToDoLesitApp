/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRBY
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int choice;

        do {
            System.out.println("\n------ TO-DO LIST MENU ------");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
                    
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    list.addTask(title);
                    break;

                case 2:
                    System.out.print("Enter task title to delete: ");
                    String delTitle = scanner.nextLine();
                    list.deleteTask(delTitle);
                    break;

                case 3:
                    list.printTasks();
                    break;

                case 4:
                    System.out.print("Enter task title to search: ");
                    String search = scanner.nextLine();
                    if (list.contains(search)) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;
                    
                case 5:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }
        } while (choice != 6);
    }
}
