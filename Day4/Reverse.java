//Write a java program to find the reverse number of the given number.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long rev=0,ld;
        long n=sc.nextLong();
        long cop=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        System.out.print(rev);
    }
}

