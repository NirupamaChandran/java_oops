package org.example;

public class Paliandrome {
    public static void main(String[] args) {
        int num=1221;

        String a="1221";
        int b=Integer.parseInt(a);      // String to Integer
        System.out.println(b);

        StringBuilder sb=new StringBuilder();

        String s=String.valueOf(num);           // Integer to String
        String s2=Integer.toString(num);

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s instanceof String);

        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
            sb.append(s.charAt(i));
        }
        if(sb.toString().equals(s2)){       // rev.equals(s)
            System.out.println("Paliandrome");
        }
        else {
            System.out.println("Not Paliandrome");
        }

        int num2=2442;
        int n2=num2;
        int rev2=0;
        while(num2!=0){
            int temp=num2%10;
            rev2=rev2*10+temp;
            num2=num2/10;
        }
        if(rev2==n2){
            System.out.println("is  palindrom");
        }else{
            System.out.println("is not palindrom");
        }

    }

}
