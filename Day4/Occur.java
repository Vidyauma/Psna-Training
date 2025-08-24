//Write a java program Count the number of occurrences of a digit in a given number.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Occur {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=sc.nextInt();
        int count=0,l=0;
        while(n>0){
            l=n%10;
            if(l==digit){
                count++;
            }
            n=n/10;
            
        }
        System.out.println(count);
        
    }
}


