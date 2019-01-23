package com.company;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        divideTwoNumbers();

    }


    public static void divideTwoNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double firstNum = input.nextDouble();

        System.out.println("Enter second number");
        double secondNum = input.nextDouble();

        double result = DivideOps(firstNum, secondNum);
        System.out.println("The result is" + result);
        }



    public static double DivideOps(double firstNum, double secondNum) {

        double result = 0;

        if (secondNum == 0) {
            System.out.println("Undefined");
            System.exit(0);

        } else {
            result = firstNum / secondNum;
        }
            return result;
        }
    }

