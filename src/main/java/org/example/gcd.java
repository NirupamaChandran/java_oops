package org.example;

public class gcd {
    public static void main(String[] args){
        int num1=48;
        int num2=18;
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println(num1);
    }
}
