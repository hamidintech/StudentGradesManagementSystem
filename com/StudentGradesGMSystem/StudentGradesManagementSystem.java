package com.StudentGradesGMSystem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author hamidintech
 * created at 10.11.2024
 * */

public class StudentGradesManagementSystem {

    // declaring ArrayLists and scanner and variables
    protected String name;
    protected int grade;
    ArrayList<String> students;
    ArrayList<Integer> grades;
    Scanner scanner = new Scanner(System.in);

    // constructor
    public StudentGradesManagementSystem() {
        this.name = " ";
        this.grade = 0; // initialize the grade from based
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
        // initializing the ArrayList into the constructor to prevent the exception during run the code
    }

    public void addStudent() {
        System.out.println("Please write the student's name :");
        name = scanner.nextLine();
        students.add(name);

        System.out.println("Please write the student's grade :");
        if (scanner.hasNextInt()) {
            grade = scanner.nextInt();
            grades.add(grade);
            scanner.nextLine();
        } else {
            System.out.println("Invalid input");
            scanner.next();
        }
    }

    public void viewAll() {
        System.out.println("Student's name List: ");
        for (String name : students) {
            System.out.println(name);
        }
        System.out.println("Student's grade List: ");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public void findGrade() {
        System.out.println("Please enter the grade you would like to search:");
        int grade = scanner.nextInt();
        if (grades.contains(grade)) {
            System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Your grade is not found");
        }
    }

    public void removeStudent() {
        System.out.println("Please enter the name you would like to remove:");
        String name = scanner.nextLine();
        students.remove(name);
        System.out.println("Please write the student's grade that you want to remove: ");
        int grade = scanner.nextInt();
        grades.remove(grade);
        System.out.println("your grade removed successfully");
        // handle if student name or grade did not find!
    }

    public void calculateAverageGrade() {
        System.out.println("Please enter the average grade you would like to calculate:");
        int grade = scanner.nextInt();
        double average = (double) (grade + grade) / students.size();
        System.out.println("Your average grade is " + average);
    }

    public void findHigherGrade() {
        System.out.println("Please enter the higher grade you would like to find:");
        int grade = scanner.nextInt();
        if (grades.contains(grade)) {
            System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Your grade is not found");
        }
    }

    public void findLowestGrade() {
        System.out.println("Please enter the lowest grade you would like to find:");
        int grade = scanner.nextInt();
        if (grades.contains(grade)) {
            System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Your grade is ont found!");
        }
    }
}