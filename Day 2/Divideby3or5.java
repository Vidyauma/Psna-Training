//Write a java program to check the number is either divisible by 3 or divisible by 5 and display the corresponding message.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divideby3or5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0){
            System.out.print("Hi");
        }
        if(n%5==0){
            System.out.print("Hello");
        }
    }
}