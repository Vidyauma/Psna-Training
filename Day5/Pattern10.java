/*
*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=2*n-1;
        for(int row=1;row<=val;row++){
            for(int col=1;col<=val;col++){
                if(row==col || (row+col)==val+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}