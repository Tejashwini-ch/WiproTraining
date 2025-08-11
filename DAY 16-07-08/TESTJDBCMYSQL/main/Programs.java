package main.java;

import java.util.ArrayList;
import java.util.List;

public class Programs {

    // 1. Reverse Multiplication Table
      public String reverseTable(int num) {
    	
        String result = "";
        for (int i = 10; i >= 1; i--) {
            result += num + " x " + i + " = " + (num * i) + "\n";
        }
        return result;
    }


    // 2. Alphabets a to z as string with spaces
    public String getAlphabets() {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch).append(' ');
        }
        return sb.toString().trim();
    }

    // 3. ASCII values of a to z,
    public String printASCIIValues() {
        String result = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            result += ch + " = " + (int) ch + "\n";
        }
        return result;
    }


    // 4. Factorial using
    public int factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("Negative numbers not supported");
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 5. Count positive, negative, zero
    public int[] countNumbers(int[] numbers) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        //using enhanced for loop
        for (int num : numbers) {
            if (num > 0) 
            	pos++;
            else if (num < 0)
            	neg++;
            else
            	zero++;
        }
        return new int[] {pos, neg, zero};
    }

    // 6. Find min and max 
    public int[] findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("Array must not be empty");
        int max = numbers[0];
        int min = numbers[0];
        //using enhanced for loop
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[] {max, min};//storing result in array.
    }

    // 7. Numbers divisible by 9 between 100 and 200 - returns int array of those numbers
    public int[] divisibleByNine() {
        int count = 0;
        int sum = 0;

        // Find how many numbers between 100 and 200 are divisible by 9
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                count++;
                sum += i;
            }
        }

        return new int[]{count, sum};
    }


    // 8. 1's complement of integer
    public int onesComplement(int num) {
        return ~num;
    }

    // 9. 2's complement of integer using ~ + 1
    public int twosComplement(int num) {
        return onesComplement(num) + 1;
    }

    // 10. Fibonacci series 
    public int[] fibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1)
        	fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
}
