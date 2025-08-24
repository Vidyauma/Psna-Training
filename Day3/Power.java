//Write a java program to find whether the given number is power of 2 or not.

import java.io.*;
import java.util.*;

public class Power {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,p=1,flag=0;
        n=sc.nextInt();
        while(n>=p){
            if(n==p){
                flag=1;
            }
            p=p*2;
            
        }
        if(flag==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}