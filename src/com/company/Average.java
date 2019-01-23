package com.company;

import java.util.Scanner;

public class Average {

    public static void main(String args[])
    {
       PromptInput();
    }

    public static void PromptInput(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1=input.nextDouble();

        System.out.println("Enter second number");
        double num2=input.nextDouble();

        System.out.println("Enter third number");
        double num3=input.nextDouble();

        double avg=Avg(num1,num2,num3);
        System.out.println("The average is"+avg);
    }

    public static double Avg(double num1, double num2, double num3){
        double avg = 0;

        avg= (num1+num2+num3)/3;

        return avg;
    }
}
