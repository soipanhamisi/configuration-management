package org.example;
public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        int totalSum = 0;
        int evenSum = 0;
        int oddSum = 0;


        for (int num : numbers) {
            totalSum += num;

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        // Print results
        System.out.println("Total sum of all numbers: " + totalSum);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}