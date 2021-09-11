package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    //Constant
    static int Gal = 350;

    public static void main( String[] args )
    {
        Scanner lengths = new Scanner(System.in);
        Scanner widths = new Scanner(System.in);

        //length
        System.out.print("What is the length of the room? ");
        double length =  lengths.nextInt();

        //width
        System.out.print("What is the width of the room? ");
        double width =  widths.nextInt();

        //output
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil((length * width)) / Gal, length * width);
    }
}
