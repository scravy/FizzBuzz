package de.scravy.fizzbuzz;

public class FizzBuzz {

    public static void main(final String... args) {

        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");                
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }

}
