package com.hollychaffee;

public class Main {
    // Java has reserved words used for "keywords". These keywords have predefined meanings,
    // therefore cannot be used as names for variables, methods, classes, or as any other identifier.

    // Expressions are building blocks of all Java programs. Expressions are built using values, literals (constants),
    // variables, operators, and method calls. Expressions are used to fetch, compute, and store values.
    // An expression is akin to a clause in the English language, which, with the right punctuation can sometimes
    // stand on it's own or also be part of a sentence.
    public static void main(String[] args) {
        // A mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // The expression is comprised of the variable, value, and operator: kilometers = (100 * 1.609344
        int highScore = 50;  // highScore = 50 is an expression

        if(highScore == 50) {  // highScore == 50 is an expression
            System.out.println("This is an expression");  //"This is an expression" is an expression :)
        }
        // Challenge - write out which parts of the code are expressions
        int score = 100;  // score = 100 is an expression
        if (score >99) {  // score >99 is an expression
            System.out.println("You got the high score");  // "You got the high score" is an expression
            score = 0;  // score = 0 is an expression
        }
    }
}
