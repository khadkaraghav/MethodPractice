package com.company;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        promptInputs();

    }

    public static void promptInputs() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int Num1 = input.nextInt();

        System.out.println("Enter second number");
        int Num2 = input.nextInt();

        int sum = SumNum(Num1, Num2);
        System.out.println(sum);
    }

    public static int SumNum(int Num1, int Num2) {

        int sum = 0;

        sum = Num1 + Num2;

        return sum;

    }
}


