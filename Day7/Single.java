//Write a program to convert the digits of the string into a single number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Single{
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String n="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                n=n+ch;
            }
        }
        if(n.length()==0)
            System.out.println("0");
        else
                        System.out.println(n);

    }
}
    