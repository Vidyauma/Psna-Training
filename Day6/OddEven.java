//Write a program to accept the array and count the number of odd and even numbers in the given array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int even=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
            if(a[i]%2==0){
                even++;
            }
        }
        System.out.println("Odd = "+(n-even));
        System.out.println("Even = "+even);
    }
}

