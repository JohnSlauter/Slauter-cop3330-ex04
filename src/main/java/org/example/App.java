package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        String noun, verb, adjective, adverb;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a noun: ");

        noun = s.nextLine();

        System.out.print("Enter a verb: ");

        verb = s.nextLine();

        System.out.print("Enter an adjective: ");

        adjective = s.nextLine();

        System.out.print("Enter an adverb: ");

        adverb = s.nextLine();

        System.out.print(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));

        s.close();

    }
}
