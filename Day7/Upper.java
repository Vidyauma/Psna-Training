//Write a program to count the number of upper-case characters in a given string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Upper {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int u=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt((i));
            if(ch>=65 && ch<=90){
                u++;
            }
        }
        System.out.print(u);
    }
}