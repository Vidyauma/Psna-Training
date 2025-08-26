//Write a program to search for a character in a string

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.nextLine();
        String word=sc.nextLine();
        if(word.contains(String.valueOf(a)))
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}