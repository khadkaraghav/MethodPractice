package com.company;

import java.util.Scanner;

public class Count {

    public static void main (String[] args){
          UserInput();
    }

    public static void UserInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = input.nextLine();

        int length = Length(str);
        System.out.println("The length of the string is"+length);
    }

    public static int Length(String str) {

        int length = str.split("\\s+").length;

        return length;

    }
}
