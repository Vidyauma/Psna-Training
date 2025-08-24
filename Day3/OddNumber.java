//Write a java program to print all the Odd numbers from 1 to n.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddNumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        
    }
}