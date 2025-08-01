//Write a java program to accept 2 numbers, print the first number as a 5-digit number and print the second number in the next line with 5 width space
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Print first number as 5-digit number with leading zeros
        System.out.printf("%05d\n", num1);

        // Print second number with width of 5, right-aligned
        System.out.printf("%5d\n", num2);
    }
}
