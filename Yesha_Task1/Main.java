package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static final String USERNAME = "admin";
    static final String PASSWORD = "123";

    static String passengerName = "";
    static String trainNo = "";
    static String trainName = "";
    static String classType = "";
    static String journeyDate = "";
    static String from = "";
    static String destination = "";
    static int pnr = 0;
    static boolean booked = false;

    public static void main(String[] args) {

        System.out.println("\n=======ONLINE RESERVATION SYSTEM=======");

        if (!login()) {
            System.out.println("Too many incorrect attempts.");
            return;
        }

        while (true) {

            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. View Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    reservation();
                    break;

                case 2:
                    cancelReservation();
                    break;

                case 3:
                    viewTicket();
                    break;

                case 4:
                    System.out.println("\nThank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }

        }

    }

    static boolean login() {

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Login ID : ");
            String id = sc.nextLine();

            System.out.print("Password : ");
            String pass = sc.nextLine();

            if (id.equals(USERNAME) && pass.equals(PASSWORD)) {

                System.out.println("\nLogin Successful!");
                return true;

            }

            attempts--;
            System.out.println("Invalid Login.");
            System.out.println("Attempts Left : " + attempts);
        }

        return false;
    }

    static void reservation() {

        System.out.println("\n====== Reservation Form ======");

        System.out.print("Passenger Name : ");
        passengerName = sc.nextLine();

        System.out.print("Train Number : ");
        trainNo = sc.nextLine();

        switch (trainNo) {

            case "12345":
                trainName = "Shtabdi Express";
                break;

            case "10000":
                trainName = "Mumbai Rajdhani";
                break;

            case "11111":
                trainName = "Saurashtra Express";
                break;

            case "1234":
                trainName = "Vande Bharat Express";
                break;

            default:
                trainName = "Special Train";
        }

        System.out.println("Train Name : " + trainName);

        System.out.print("Class Type (Sleeper / AC / First) : ");
        classType = sc.nextLine();

        System.out.print("Journey Date (DD-MM-YYYY) : ");
        journeyDate = sc.nextLine();

        System.out.print("From : ");
        from = sc.nextLine();

        System.out.print("Destination : ");
        destination = sc.nextLine();

        Random random = new Random();

        pnr = 100000 + random.nextInt(900000);

        booked = true;

        System.out.println("\nReservation Successful!");
        System.out.println("Your PNR Number : " + pnr);

    }

    static void viewTicket() {

        if (!booked) {

            System.out.println("\nNo Reservation !");
            return;

        }

        System.out.println("\n======== TICKET ========");

        System.out.println("PNR Number      : " + pnr);
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Train Number    : " + trainNo);
        System.out.println("Train Name      : " + trainName);
        System.out.println("Class Type      : " + classType);
        System.out.println("Journey Date    : " + journeyDate);
        System.out.println("From            : " + from);
        System.out.println("Destination     : " + destination);

    }

    static void cancelReservation() {

        if (!booked) {

            System.out.println("\nNo Reservation Available!");
            return;

        }

        System.out.print("\nEnter PNR Number : ");
        int enteredPNR = sc.nextInt();
        sc.nextLine();

        if (enteredPNR == pnr) {

            System.out.println("\nReservation Found!");

            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Train Number: " + trainNo);
            System.out.println("Train Name: " + trainName);
            System.out.println("Class Type: " + classType);
            System.out.println("Journey Date: " + journeyDate);
            System.out.println("From: " + from);
            System.out.println("Destination: " + destination);

            System.out.print("\nConfirm Cancellation (Y/N): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("Y")) {

                passengerName = "";
                trainNo = "";
                trainName = "";
                classType = "";
                journeyDate = "";
                from = "";
                destination = "";
                pnr = 0;
                booked = false;

                System.out.println("\nReservation Cancelled Successfully!");

            } else {

                System.out.println("\nCancellation Cancelled.");

            }

        } else {

            System.out.println("\nInvalid PNR Number!");

        }

    }
}