//Write a program to print corresponding day based on given input.
/*Sample Input 0

0
Sample Output 0

Sunday*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CDay {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        switch(op){
            case 0:
                System.out.println("Sunday");
                break;
                 case 1:
                System.out.println("Monday");
                break;
                 case 2:
                System.out.println("Tuesday");
                break;
                 case 3:
                System.out.println("Wednesday");
                break;
                 case 4:
                System.out.println("Thursday");
                break;
                 case 5:
                System.out.println("Friday");
                break;
                 case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}