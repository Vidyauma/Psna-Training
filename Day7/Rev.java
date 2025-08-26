//Write a program to reverse a given string without using in-built functions

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rev{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String revStr="";
        for(int i=n-1;i>=0;i--){
            revStr=revStr+str.charAt(i);
            
        }
        System.out.print(revStr);
    }
}