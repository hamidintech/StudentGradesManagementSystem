package com.StudentGradesGMSystem;
import java.util.Scanner;

public class MainMethod {

    static Scanner scanner = new Scanner(System.in);

    // linked the class methods to main method's file
static StudentGradesManagementSystem studentgradesmanagementsystem = new StudentGradesManagementSystem();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. addStudent");
            System.out.println("2. removeStudent");
            System.out.println("3. viewAll");
            System.out.println("4. findGrade");
            System.out.println("5. calculateAverageGrade");
            System.out.println("6. findHigherGrade");
            System.out.println("7. findLowestGrade");
            System.out.println("8. exit");
            System.out.println("Please choose the option from the menu:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentgradesmanagementsystem.addStudent();
                    break;

                case 2:
                    studentgradesmanagementsystem.removeStudent();
                    break;

                case 3:
                    studentgradesmanagementsystem.viewAll();
                    break;

                case 4:
                    studentgradesmanagementsystem.findGrade();
                    break;

                case 5:
                    studentgradesmanagementsystem.calculateAverageGrade();
                    break;

                case 6:
                    studentgradesmanagementsystem.findHigherGrade();
                    break;

                case 7:
                    studentgradesmanagementsystem.findLowestGrade();
                    break;

                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (true);
    }
}