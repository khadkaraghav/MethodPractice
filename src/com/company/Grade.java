package com.company;

import java.util.Scanner;

public class Grade {


    public static void userInput() {
        //ask to enter percentage
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the percentage");
        int perCent = input.nextInt(); //stores the percentage value

        System.out.println("The grade is");

        String grade = Ops(perCent); // declaring grade and taking operation from next method
        System.out.println(grade);//print the grade


    }
//A = 90–100%
//B = 80–89%
//C = 70–79%
//D = 60–69%
//F = 0–59%

    public static String Ops(int perCent) {

        String grade;
        switch (perCent / 10) {
            case 10:
                grade = "A";
                break;

            case 9:
                grade = "A";
                break;

            case 8:
                grade = "B";
                break;

            case 7:
                grade = "C";
                break;

            case 6:
                grade = "D";
                break;

            default:
                grade = "F";


        }
        return grade;
    }


    public static void main(String[] args){
        userInput();
    }
}

