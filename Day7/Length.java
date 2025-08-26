//Write a program to find the length of the string without using in-built function

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Length {
    public static int showLength(String myString){
        int i=0;
        try{
            while(true){
            myString.charAt(i);
            i++;
            
        }
    }catch(IndexOutOfBoundsException e){
            return i;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(showLength(st));
    
    }
}