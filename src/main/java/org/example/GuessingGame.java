package org.example;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {


//    need a secret number
//    user needs to guess it - take input?
//    if too high ir tow, et them know
//    if guessed correctly let them know


        Integer secretNumber = 9;
        System.out.println("Guess my favourite number!");
        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();
        System.out.println("Your guess was: " + guess);

//     parsing is when you're converting one data type into another data type. For example a string into an integer
// ofc we could have just used nextInt. but this is another method:

        if(guess.equals(String.valueOf(secretNumber))) {  // Using this to convert our integer into a string
            System.out.println("Nice, that is my favourite!");
        } else if (secretNumber < Integer.valueOf(guess)) {  // Converting our string into an integer so we can program in whhether it is larger or smaller than oursecret number
            System.out.println(" Too high, guess again!");
        } else if (secretNumber > Integer.valueOf(guess)) {
            System.out.println("Too low, guess again");
        }

    }
}
