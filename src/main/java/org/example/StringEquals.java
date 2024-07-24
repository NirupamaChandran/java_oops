package org.example;

public class StringEquals {
    public static void main(String[] args) {
        String str1=new String("Hello");
        String  str2=new String("Hello");
        System.out.println(str1==str2);

        System.out.println(""=="");
        System.out.println("A"=="A");
        System.out.println("a==A");
    }
}
