package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    public static void main(String args[]){
        Sorting();
    }

    public static void Sorting(){

        ArrayList<String> letters = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        for (int i=0;i<5;i++) {

            System.out.println("Enter the names you would like to sort");
            String letter = input.nextLine();
            letters.add(letter);

            Collections.sort(letters);
        }

        System.out.println("The sorted letters are");

        for (String sortedLetters : letters)
        System.out.println(sortedLetters);
    }
}
