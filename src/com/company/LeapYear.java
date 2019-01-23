package com.company;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args)
    {
        PromptInput();
    }


    public static void PromptInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = input.nextInt();

        Output(year);

    }

    public static int Output(int year) {
        if (year % 4 == 0) {
            System.out.println(+year + "\tis a leap year");
        } else {
            System.out.println(+year + "\tis not a leap year");
        }
        return 0;
    }
}

