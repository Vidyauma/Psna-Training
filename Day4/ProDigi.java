//Write a java Program to find the product of the digits in a given number.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProDigi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n,ld,pro=1;
        n=sc.nextInt();
        while(n>0){
            ld=n%10;
            pro=pro*ld;
            n=n/10;
        }
        System.out.println(pro);
    }
}
