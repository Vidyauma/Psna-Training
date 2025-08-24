//Print all the prime digits in a given number.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ld,p=1;
        long copy=n;
        while(n>0){
            n=n/10;
            p=p*10;
        }p=p/10;
        n=copy;
        while(p>0){
            ld=n/p;
           
           
            if(ld==2||ld==3||ld==5||ld==7){
                System.out.print(ld+" ");
               
            } n=n%p;
            p=p/10;
        }
        
        
        
    }
}

