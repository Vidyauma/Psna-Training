//Write a java program to divide the given two numbers and print the quotient without using / operator.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println(count);
        
    }
}