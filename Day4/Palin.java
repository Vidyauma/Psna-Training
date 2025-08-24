//Write a java program to find whether the given number is Palindrome or Not

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long rev=0,ld;
        long n=sc.nextLong();
        long cop=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
       if(cop==rev){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not a Palindrome");
       }
    }
}