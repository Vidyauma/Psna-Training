//Write a program to accept the elements into an array and replace every element in the array with the sum of left side element

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumLeft {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(sum+" ");
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
    }
}