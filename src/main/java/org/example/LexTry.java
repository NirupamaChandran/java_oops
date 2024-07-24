package org.example;

public class LexTry {
    public static void main(String[] args) {
        char ch=97;
        System.out.println(ch);

        int n='a';
        System.out.println(n);

        String s="xyz";
        int a;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            System.out.println((int)c);
            int ascii=(int)c;
            a=ascii +1;
//            System.out.println(a);
            if(a>'z'){
                a-=26;
            }
            char value=(char)a;
            sb.append(value);

        }
        System.out.println(sb);
    }
}
