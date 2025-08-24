//Write a java program to find the sum of even numbers in the given range.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sum{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //int sum=0;
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0){
                sum=sum+i;
                
                
            }
        }
        System.out.println(sum);
    }
}
