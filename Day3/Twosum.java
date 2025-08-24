//Write a java program multiply the given two numbers without using * operator.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Twonum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<b;i++){
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
