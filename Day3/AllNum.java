//Write a java program to print all the numbers from 1 to n.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AllNum {

    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}