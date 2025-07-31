/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRBY
 */
public class ToDoList {
    private TaskNode head;
    private int count = 0;

    public void addTask(String title) {
        TaskNode newTask = new TaskNode(title);
        if (head == null) {
            head = newTask;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        count++;
        System.out.println("\nTask added!");
    }
    public void deleteTask(String title) {
        if (head == null) {
            System.out.println("\nList is empty.");
            return;
        }

        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            count--;
            System.out.println("\nTask deleted!");
            return;
        }
        TaskNode current = head;
        while (current.next != null && !current.next.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("\nTask not found.");
        } else {
            current.next = current.next.next;
            count--;
            System.out.println("\nTask deleted!");
        }
    }
    public void printTasks() {
        if (head == null) {
            System.out.println("\nNo tasks found.");
            return;
        }
        System.out.println("\nYour Tasks:");
        TaskNode current = head;
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
        System.out.println("Total tasks: " + count);
    }
    public boolean contains(String title) {
        TaskNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void insertAtIndex(String title, int index) {
        if (index < 0 || index > count) {
            System.out.println("Invalid index.");
            return;
        }
        TaskNode newTask = new TaskNode(title);
        if (index == 0) {
            newTask.next = head;
            head = newTask;
        } else {
            TaskNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newTask.next = current.next;
            current.next = newTask;
        }
        count++;
        System.out.println("Task inserted at index " + index + "!");
    }
    public int getTaskCount() {
        return count;
    }
}


