//Write a program to accept the element into an array and replace every element in the array with the sum of its every other element

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRep {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        int sum=0;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
            sum=sum+b[i];
        }
        for(int i=0;i<a;i++){
            System.out.print(sum-b[i]+" ");
        }
    }
}