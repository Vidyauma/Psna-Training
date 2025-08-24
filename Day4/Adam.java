//Find whether the given number is Adam or Not.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Adam{

    public static long reverse(long n) {
        long rev=0,ld;
        long cop=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        return(rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long n_square=n*n;
        long rev_n=reverse(n);
        long n_square_rev=rev_n*rev_n;
        long result=reverse(n_square_rev);
        if(result==n_square){
            System.out.println("Adam Number");
        }else{
            System.out.println("Not a adam number");
        }
    }
}

