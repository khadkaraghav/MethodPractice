package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomWords {

    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {

        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        words.add("Module");
        words.add("Class");
        words.add("Implement");


        String RandomWord = randWord(words);
        System.out.println(RandomWord);

    }


    public static String randWord(ArrayList words) {


        Collections.shuffle(words);

        String RandomWord = (String) words.get(0);

        return RandomWord;
    }
}
