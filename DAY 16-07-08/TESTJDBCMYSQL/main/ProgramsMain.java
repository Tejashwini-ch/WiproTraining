package main.java;

import java.util.List;
import java.util.Scanner;

public class ProgramsMain {
    public static void main(String[] args) {
        Programs programs = new Programs();
        Scanner sc = new Scanner(System.in);

        // 1. Reverse Multiplication Table
        System.out.print("Enter a number for reverse multiplication table: ");
        int num = sc.nextInt();
        String reverseTable = programs.reverseTable(num);
        System.out.println("\nReverse Multiplication Table:");
        System.out.print(reverseTable);


        // 2. Alphabets a to z
        System.out.println("\nAlphabets a to z:");
        System.out.println(programs.getAlphabets());

        // 3. ASCII values a to z
        System.out.println("\nASCII values of a to z:");
        String asciiValues = programs.printASCIIValues();
        System.out.print(asciiValues);


        // 4. Factorial
        System.out.print("\nEnter a number to find factorial: ");
        int factNum = sc.nextInt();
        try {
            int fact = programs.factorial(factNum);
            System.out.println("Factorial of " + factNum + " is " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 5. Count positives, negatives, zeros
        System.out.print("\nEnter how many numbers you want to input for counting positive/negative/zero: ");
        int countSize = sc.nextInt();
        int[] countArray = new int[countSize];
        System.out.println("Enter " + countSize + " numbers:");
        for (int i = 0; i < countSize; i++) {
            countArray[i] = sc.nextInt();
        }
        int[] counts = programs.countNumbers(countArray);
        System.out.println("Positive numbers: " + counts[0]);
        System.out.println("Negative numbers: " + counts[1]);
        System.out.println("Zeros: " + counts[2]);

        // 6. Find largest and smallest number
        System.out.print("\nEnter how many numbers you want to input for finding min and max: ");
        int minMaxSize = sc.nextInt();
        int[] minMaxArray = new int[minMaxSize];
        System.out.println("Enter " + minMaxSize + " numbers:");
        for (int i = 0; i < minMaxSize; i++) {
            minMaxArray[i] = sc.nextInt();
        }
        try {
            int[] minMax = programs.findMinMax(minMaxArray);
            System.out.println("Largest number: " + minMax[0]);
            System.out.println("Smallest number: " + minMax[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 7. Divisible by 9 between 100 and 200
        int[] div9 = programs.divisibleByNine();
        System.out.println("\nNumbers divisible by 9 between 100 and 200:");
        System.out.println("Count: " + div9[0]);
        System.out.println("Sum: " + div9[1]);

        // 8. 1's complement
        System.out.print("\nEnter a number for 1's complement: ");
        int onesNum = sc.nextInt();
        int onesComp = programs.onesComplement(onesNum);
        System.out.println("1's complement of " + onesNum + " is " + onesComp);

        // 9. 2's complement
        System.out.print("\nEnter a number for 2's complement: ");
        int twosNum = sc.nextInt();
        int twosComp = programs.twosComplement(twosNum);
        System.out.println("2's complement of " + twosNum + " is " + twosComp);

        // 10. Fibonacci series
        System.out.print("\nEnter number of terms for Fibonacci series: ");
        int fibTerms = sc.nextInt();
        int[] fibonacciSeries = programs.fibonacci(fibTerms);
        System.out.println("Fibonacci series up to " + fibTerms + " terms:");
        for (int val : fibonacciSeries) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
