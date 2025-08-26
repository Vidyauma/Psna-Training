//Write a program to accept the string and rotate the string n times

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rotate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        int n=k%a.length();
        String ch=a.substring(n)+a.substring(0,n);
        System.out.print(ch);
    }
}