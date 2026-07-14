package org.example;

import java.util.Scanner;

public class Exam {

    String[] questions = {

            "Java is a?",
            "Which keyword creates object?",
            "JVM stands for?",
            "Which loop executes at least once?",
            "Which package contains Scanner?",
            "Java supports?",
            "Which operator compares values?",
            "Array index starts from?",
            "Java is developed by?",
            "Which method is entry point?"
    };

    String[][] options = {

            {"A. Programming Language","B. Browser","C. Database","D. OS"},
            {"A. make","B. new","C. object","D. create"},
            {"A. Java Virtual Machine","B. Java Variable Method","C. Joint Virtual Machine","D. None"},
            {"A. for","B. while","C. do-while","D. foreach"},
            {"A. java.util","B. java.io","C. java.lang","D. java.awt"},
            {"A. OOP","B. POP","C. Functional only","D. None"},
            {"A. =","B. ==","C. !=","D. :="},
            {"A. 1","B. -1","C. 0","D. 2"},
            {"A. Microsoft","B. Google","C. Sun Microsystems","D. Apple"},
            {"A. run()","B. start()","C. main()","D. execute()"}
    };

    char[] answers = {'A','B','A','C','A','A','B','C','C','C'};

    public void startExam() {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        long start = System.currentTimeMillis();

        long duration = 120000; //2 minutes

        for(int i=0;i<questions.length;i++) {

            long current = System.currentTimeMillis();

            if(current-start>=duration) {

                System.out.println("\nTime Over!");
                System.out.println("Exam Submitted Automatically.");

                break;

            }

            long remain=(duration-(current-start))/1000;

            System.out.println("====Time Left : "+remain+" sec====");

            System.out.println("\nQ"+(i+1)+". "+questions[i]);

            for(String op:options[i])

                System.out.println(op);

            System.out.print("Answer (A/B/C/D): ");

            char ans=sc.next().toUpperCase().charAt(0);

            if(ans==answers[i])

                score++;

        }

        System.out.println("\n======EXAM FINISHED======");

        System.out.println("Correct Answers : "+score);

        System.out.println("Wrong Answers : "+(10-score));

        System.out.println("Score : "+score+"/10");

        double percent=score*10;

        System.out.println("Percentage : "+percent+"%");

        if(percent>=40)

            System.out.println("Result : PASS");

        else

            System.out.println("Result : FAIL");

    }

}
