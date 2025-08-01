//Write a java program to accept an integer from the user and print the number along with its sign.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept integer input
        int num = sc.nextInt();

        // Display the number with sign
        if (num > 0) {
            System.out.println("+" + num);
        } else {
            System.out.println(num);  // Negative numbers and 0 already have correct sign format
        }
    }
}
