/*Design an applicationthat will prompt the user for the numerical value of two cards. The program will receive the two numbers and display their sum on the screen. If the calculated sum is 21, an asterisk is to be displayed beside the sum.

        The program shall end when two zeros are entered.The program shall print a welcome message when it is first started and an goodbye message when it terminates.

        Bonus:
        Modify the application to allow the user to enter the face cards as J,Q,K or A. If the user enters J, Q, or K then convert the entered value to 10. If the user enters A then count the value as 11 points.

        Bonus Bonus:
        Modify the algorithm to allow the user who receives the A to designate it either as 1 or 11.

        Objective
        Define the problem by constructing an algorithm using pseudocode
        What control structures (sequence, selection and repetition) are required?
        What variables are required?
        Show a check of your solution with test data for at least two valid test cases*/










package com.company;

import java.util.Scanner;

public class Cards {


    public static void main(String[] args) {
        inputUser();
    }

    public static void inputUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("\tWelcome");

        System.out.println("Enter a card from the following : J, Q, K, A");
        String card = input.next();

        switch (card) {

            case "J":
                int n = 10;
                System.out.println(n);
                break;

            case "Q":
                int num = 10;
                System.out.println(num);
                break;

            case "K":
                int num2 = 10;
                System.out.println(num2);
                break;

            case "A":
                System.out.println("Is it 1 or 11?");
                int num3 = input.nextInt();
                System.out.println(num3+"\tpoints");
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}






/*  while (numFirst != 00) {

            System.out.println("Enter numerical value of another card");
            double numSecond = input.nextDouble();

            if (numSecond != 00) {
                SumofNum(numFirst, numSecond);
            }

                System.out.println("Goodbye");
                System.exit(0);
            }
        }


        public static void SumofNum(double numFirst, double numSecond){

            double sum = numFirst + numSecond;

            if (sum==21){
                System.out.println("The sum is"+sum+"*");
            }
            else {
                System.out.println("The sum is"+sum);
            }
        }*/
