/*
1
24
135
2468
13579
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val,i,j,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0)
                val=2;
            else
                val=1;
        
            for(j=1;j<=i;j++){
                System.out.print(val);
                val=val+2;
            
        }
        System.out.println();
        }
        
    }
}