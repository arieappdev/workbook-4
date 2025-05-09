package com.bellagio.blackjack.models;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //datatype                                //ArrayList class constructor
        ArrayList<String> gamerNames = new ArrayList<>();

//        //short version of writing this code
//        gamerNames.add("Arie");
//        gamerNames.add("Naudio");
//        gamerNames.add("Noble");
//        gamerNames.add("Cavern");

        //long version
        System.out.println("Enter player name: ");
        String gamerName1 = scanner.nextLine();
        gamerNames.add(gamerName1);
        System.out.println();

        System.out.println("Would you like to add another player?");

        if String addPlayer =(); {
            

        }

        for (String gamerName : gamerNames) {
            System.out.println(gamerName);

        }
    }
}
