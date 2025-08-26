//Write a program to count the special characters in the given string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Special {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int s=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                s++;
            }
        }
        System.out.print(s);
    }
}