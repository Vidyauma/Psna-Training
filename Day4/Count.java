//Count the number of digits in a given number.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Count {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long NUM,count=0;
        NUM=sc.nextLong();
        while(NUM>0){
            count++;
            NUM=NUM/10;
        }
        System.out.println(count);
    }
}

