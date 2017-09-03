//  Name        : Shao Xuan Chew
//  UIN         : 658953669
//  Date        : 8/29/2017
//  Class       : CS 126
//  Instructor  : Zilles, Craig
//  Assignment  : Bedazzler
//  File Name   : Bedazzler.java
//  Compiler    : IntelliJ IDEA Ultimate 2017.2 on MacOS Sierra
//
// Review of CS126 (Fall 2017 @ UIUC)

/* Description:
 This program takes a String and produces a bedazzled String by adding an asterisk between characters, and also doubling
 the spaces.
*/
//Package
package com.xuanchew;

//Import
import java.util.Scanner;

public class Bedazzler {
    //Constant
    public static final String DELIMITER = "*";


    public static String bedazzle(String input){

        //Declare character array and assign characters from string input into it
        char[] letters = input.toCharArray();

        //Initialize StringBuilder
        StringBuilder sb = new StringBuilder();



        //For loop to iterate through array
        for(int i = 0; i < letters.length; i++){
            sb.append(DELIMITER + letters[i]);

            //add an asterisk after sentences
            if(i + 1 == letters.length){
                sb.append(DELIMITER);
            }

            //add a space at a space to double it
            if(Character.isWhitespace(letters[i])){
                sb.append(" ");
            }

        }
        //Returns final String
        return sb.toString();
    }


    //Main method
    public static void main(String[] args){
        //Declare Input String Variable
        String input;

        //Initialize Scanner
        Scanner scan = new Scanner(System.in);

        //Request for input, read input
        System.out.print("Input a string to BEDAZZLE: ");
        input = scan.nextLine();

        //Call Bedazzle
        System.out.println(Bedazzler.bedazzle(input));

        //Close Scanner
        scan.close();
    }
}


