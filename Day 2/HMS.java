/*Write a program to check whether the time is valid or not using conditional construct.

Input Format

hh:mm:ss

Output Format

VALID/NOT VALID*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HMS{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String timeString=sc.next();
        String[] t=timeString.split(":");
        int h=Integer.parseInt(t[0]);
         int m=Integer.parseInt(t[1]);
         int s=Integer.parseInt(t[2]);
        
        
    
        if(h>=0 && h<12 && m>=0 && m<60 && s>=0 && s<60){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
            }
}