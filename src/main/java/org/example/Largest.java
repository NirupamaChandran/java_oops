package org.example;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("enter five numbers");
        int i=1;
        int s=0;
        while(i<=5){
            Scanner in=new Scanner(System.in);
            int b=in.nextInt();
            if(b>s){
                s=b;
            }
            ++i;

        }
        System.out.println("greatest is " + s);
    }
}
