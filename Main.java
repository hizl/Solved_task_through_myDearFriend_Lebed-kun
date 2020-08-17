/**Iterating over arrays  Check if an array contains two numbers
 *
 *Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).
 *
 *Input data format
 *
 *The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 *
 *Output data format
 *
 * Only a single value: true or false.
 *
 *
 *Sample Input 1:
 *
 * 3
 * 1 3 2
 * 2 3
 *
 *Sample Output 1:
 *
 * true
 *
 *
 *Sample Input 2:
 *
 * 3
 * 2 1 2
 * 2 3
 *
 *Sample Output 2:
 *
 * false
 *
 * **/







package com.company.dev.ar;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = readAndCreateArray(scanner);
        int[] number = readCheckNumber(scanner);
        System.out.printf("%b\n", checkNumber(array, number));
    }

    public static boolean checkNumber(int[] array, int[] number) {
        int firstNumber = number[0];
        int secondNumber = number[1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == firstNumber && array[i + 1] == secondNumber ||
                    array[i] == secondNumber && array[i + 1] == firstNumber) {
                return true;
            }
        }
        return false;
    }

    public static int[] readCheckNumber(Scanner scanner) {
        int[] number = new int[2];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        return number;
    }

    public static int[] readAndCreateArray(Scanner scanner) {
        int countNumber = scanner.nextInt();
        int[] array = new int[countNumber];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}