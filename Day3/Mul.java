//Write a java program to print the multiplication table as per the multiplicant and n.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mul {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i+" * "+b+" = "+i*b);
        }
    }
}
