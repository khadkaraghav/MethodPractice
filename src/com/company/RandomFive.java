package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomFive {

    public static void main(String[] args) {

    }

    public static void UserInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNum = input.nextInt();

        System.out.println("Enter the last number");
        int lastNum = input.nextInt();

        int rndNum = RandomNum(firstNum, lastNum);
        if ((rndNum > firstNum) && (rndNum < lastNum)) {
            System.out.println("The five random numbers are" + rndNum);
        } else {
            System.exit(0);
        }


        public static int RandomNum ( int firstNum, int lastNum){

            ArrayList<Integer> rndNum = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++) {

            }

            return rndNum;

        }
    }
}