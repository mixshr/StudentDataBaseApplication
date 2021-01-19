package studentdatabaseapp;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - freshmen\n2 - for sophmore\n3 - junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
    }

    // Generate an id
    private void setStudentID() {
        // Generate level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        courses = "";
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + " " + course;
                tuitionBalance += costOfCourse;
            } else break;
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuiton
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment");
        viewBalance();
    }

    // Show status
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}