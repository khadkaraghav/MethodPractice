package com.company;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args)
    {
        userInp();
    }

    public static void userInp() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = input.nextInt();

        evenOdd(num);

    }
        public static void evenOdd(int num){

        if (num % 2==0) {
            System.out.println("The number is even");

        }   else {
                System.out.println("The number is odd");
            }
        }

}

