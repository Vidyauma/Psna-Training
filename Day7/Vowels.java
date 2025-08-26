//Write a program to replace all vowels with spaces

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String replace=str.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(replace);

    }
}