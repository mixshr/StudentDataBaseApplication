package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {

        // Ask how many students we want to app
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new student
        for (int i = 0; i < numOfStudents; i++) {
            Student student = new Student();
            student.enroll();
            student.payTuition();
            students[i] = student;
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}