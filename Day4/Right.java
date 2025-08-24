//Write a java program to display the digits of a given number from right to left.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Right {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,ld;
        n=sc.nextInt();
        while(n>0){
            ld=n%10;
            n=n/10;
            System.out.print(ld+" ");
        }
        
    }
}

