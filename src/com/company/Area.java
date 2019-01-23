package com.company;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        AreaTwoNumbers();

    }


    public static void AreaTwoNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length");
        double firstInt = input.nextDouble();

        System.out.println("Enter breadth");
        double secondInt = input.nextDouble();

        double area = AreaOps(firstInt, secondInt);
        System.out.println("The area is\t" +area);
    }



    public static double AreaOps(double firstInt, double secondInt) {

        double area = 0;

        area = firstInt * secondInt;

        return area;
    }
}

