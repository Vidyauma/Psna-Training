/*
*******
**      **
*  *  *  *
*    *    *
*  *  *  *
**      **
*******

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern7{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
       int z=2*n-1;
        for(i=1;i<=z;i++){
            for(j=1;j<=z;j++){
                if(i==1 || i==z||j==1 ||j==z||i==j||i+j==z+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}