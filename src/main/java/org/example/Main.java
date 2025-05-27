package org.example;
public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        // Print results
        System.out.println("Total sum of all numbers: " + totalSum(numbers));
        System.out.println("Sum of even numbers: " + evenSum(numbers));
        System.out.println("Sum of odd numbers: " + oddSum(numbers));
    }
    public static int evenSum(int[] numbers) {
        int evenSum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }
        return evenSum;
    }
    public static int oddSum(int[] numbers) {
        int oddSum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddSum += num;
            }
        }
        return oddSum;
    }

    public static int totalSum(int[] numbers) {
        int totalSum = 0;
        int evenSum = 0;
        int oddSum = 0;


        for (int num : numbers) {
            totalSum += num;

        }

        return totalSum;
    }
}