//Write a java program to find the LCM of the given two numbers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LCM {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a, b, i = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        // Loop to find LCM
        while (true) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i); // Print the LCM
                break;
            }
            i++;
        }
    }
}
