package com.company;

import java.util.Scanner;

public class MathProblem {

    public static void main(String[] args) {
        input();
    }


      public static void input()
      {
          Scanner input = new Scanner(System.in);

         System.out.println("Which area do you wanna calculate?");
         String selection = input.next();

        if(selection.equalsIgnoreCase("circle")) {

            System.out.println("Enter radius");
            double radius = input.nextDouble();
            circle(radius);}

        if(selection.equalsIgnoreCase("triangle")) {
            System.out.println("Enter base");
        double base = input.nextDouble();

        System.out.println("Enter height");
        double height = input.nextDouble();
            triangle(base,height);}

        if(selection.equalsIgnoreCase("rectangle")){
        System.out.println("Enter length");
        double length = input.nextDouble();

        System.out.println("Enter width");
        double width = input.nextDouble();
            rectangle(length,width);}

        if(selection.equalsIgnoreCase("triangle")){
        System.out.println("Enter length of square");
        double lengthOfSquare = input.nextDouble();
            square(lengthOfSquare);}

    }

    public static void circle(double radius){

        double pi=3.14;

        double areaOfCircle=pi*radius*radius;
        System.out.println("The area of circle is"+areaOfCircle);
    }

    public static void triangle(double base,double height){

        double areaOfTriangle=0.5*base*height;
        System.out.println("The area of triangle is"+areaOfTriangle);
    }

    public static void rectangle(double length, double width){

        double areaOfRectangle=length*width;
        System.out.println("The area of rectangle is"+areaOfRectangle);
    }

    public static void square(double lengthOfSquare){

        double areaOfSquare=lengthOfSquare*lengthOfSquare;
        System.out.println("The area of square is"+areaOfSquare);
    }
}
