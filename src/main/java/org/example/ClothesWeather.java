package org.example;

import java.util.Scanner;

public class ClothesWeather {
    public static void main(String[] args) {
// There is something called a 'Bouncer pattern' where you put in the if statements before the function. This of it like an actual bouncer outside a club checking if someone is above 18, not drunk, and has no weapons on them. Theses conditions are not directly connected but must be met first.
        Scanner reader = new Scanner(System.in);

        System.out.println("Please describe the weather (e.g. sunny, rainy, snow)");
        String weather = reader.nextLine();

        System.out.println("Please enter the temperature in Celsius");
        int temperature = reader.nextInt();

        if (weather.toLowerCase().equals("sunny") && temperature > 8){  // Doing the .lowercase() lowercases the input text to stop this case sensitive issue
            System.out.println("Short sleeve and shorts");

        }
        if (weather.toLowerCase().equals("sunny") && temperature < 8) {
            System.out.println("Sunglasses and a thin coat");

        }

    }
}
