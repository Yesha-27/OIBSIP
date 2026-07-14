package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String Uname = "admin";
        String pass = "123";
        String name = "admin";
        String email = "admin@gmail.com";

        Scanner sc = new Scanner(System.in);
        System.out.println("=====Online Examination=====");

        System.out.println("Enter Username:");
        String user = sc.nextLine();

        System.out.println("Enter password:");
        String ps = sc.nextLine();

        if (!user.equals(Uname) || !ps.equals(pass)) {
            System.out.println("Invalid Login!");
            return;
        }
        System.out.println("\nLogin Successful!");

        while (true) {
            System.out.println("\n====Menu====");
            System.out.println("1. Update Profile");
            System.out.println("2.Change Password");
            System.out.println("3.Start Exam");
            System.out.println("4.Logout");

            System.out.println("Enter your Choice:");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("Enter Name:");
                    name = sc.nextLine();

                    System.out.println("Enter Email id:");
                    email = sc.nextLine();

                    System.out.println("Profile Updated..!");
                    break;

                case 2:
                    System.out.print("Enter Current Password:");
                    String old = sc.nextLine();

                    if (old.equals(pass)) {
                        System.out.println("Enter new Password:");
                        pass = sc.nextLine();
                        System.out.println("Password Changed..!");
                    } else {
                        System.out.println("Wrong Password!");
                    }
                    break;

                case 3:
                    Exam exam = new Exam();
                    exam.startExam();
                    break;

                case 4:
                    System.out.println("Logged Out !");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}