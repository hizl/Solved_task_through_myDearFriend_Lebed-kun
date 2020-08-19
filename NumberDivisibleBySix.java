/*Given the sequence of natural numbers. Find the sum of numbers divisible by 6. The input is the number of elements in the sequence, and then the elements themselves. In this sequence, there is always a number divisible by 6.

Sample Input 1:

8
11
12
68
6
98
81
36
86

Sample Output 1:

54

*/


package com.company.dev.ar;

import java.util.Scanner;

public class NumberDivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] readNumber = readArray(scanner);
        int answer = countNumber(readNumber);
        System.out.printf("Sum numbers divisible by 6(six) : %d\n", answer);
    }

    public static int countNumber(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += (number % 6 == 0) ? number : 0;

            //writing test from by this method, create class Test.
        }
        return sum;
    }

    public static int[] readArray(Scanner scanner) {
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

