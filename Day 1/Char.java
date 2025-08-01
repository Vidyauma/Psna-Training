//Write a java program to accept a character from the user and print the character


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Char{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           char ch = sc.next().charAt(0);
               System.out.println(ch);
    }
}