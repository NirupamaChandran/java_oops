package org.example;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s="i love india";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        System.out.println(words);

        for(String w:words){
            StringBuilder rev=new StringBuilder(w).reverse();
            sb.append(rev).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
