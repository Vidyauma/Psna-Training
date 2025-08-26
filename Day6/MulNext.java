//Write a program in java to update every array element with multiplication of previous and next numbers in array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MulNext{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print(a[i]*a[i+1]+" ");
            }else if(i==n-1){
                System.out.print(a[i]*a[i-1]+" ");
                
            }else{
                System.out.print(a[i+1]*a[i-1]+" ");
            }
        }
        
    }
}