package com.company;

import java.util.Scanner;

public class lengthOfString {

    public static void main(String args[])
    {
        Input();
    }


    public static void Input(){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the name of the string");
        String str = input.nextLine();

        double length= LengthOf(str);

    }

    public static double LengthOf(String str){

        int length=0;
        System.out.println("The length of the string is\t"+str.length());
        return length;
    }

}


