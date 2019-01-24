package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomFive {

    public static void main(String[] args) {
        UserInput();
    }

    public static void UserInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the last number");
        int lastNum = input.nextInt();

        System.out.print("The five random numbers are\n");
        for (int i = 0; i < 5; i++) {

            int rndNumList = RandomNum(lastNum);
            System.out.print(rndNumList+",");

        }

    }
    public static int RandomNum(int lastNum) {


           int rndNumList = (int) (Math.random() * lastNum + 1);

            return rndNumList;

        }
    }


