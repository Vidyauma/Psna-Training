//Write a program to count the number of zeros and ones in an array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Zero{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        //int even=0;
        int zc=0,oc=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
           if(a[i]==0){
            zc++;
        }
         else if(a[i]==1){
            oc++;
        }
        }
        System.out.println("zc = " + zc);
        System.out.println("oc = " + oc);
    }
}