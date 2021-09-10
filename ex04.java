/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this is a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

import java.util.Scanner;
public class ex04{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // prompt user to enter information for the story
            System.out.print("Enter a noun: ");
            String noun = input.nextLine();

            System.out.print("Enter a verb: ");
            String verb = input.nextLine();

            System.out.print("Enter an adjective: ");
            String adjective = input.nextLine();

            System.out.print("Enter an adverb: ");
            String adverb = input.nextLine();

        //prints the story output
        System.out.println("You "+verb+" your "+adjective  + noun  + adverb+"? That's hilarious!");

    }//end of main
}//end of class