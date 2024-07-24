package org.example;

public class Symmetric {
    public static void main(String[] args) {
        String s="abcabcbbb";
        String s1=s.substring(0,s.length()/2);      // end index excluded
        String s2=s.substring(s.length()/2,s.length());
        System.out.println(s1);
        if(s1.equals(s2)){
            System.out.println("Symmetric match");
        }
        else {
            System.out.println("not Symmetric match");
        }
    }
}
