package org.example;

public class lcm {
    public static void main(String[] args){
        int num1=3,num2=4;
        int lcm=Math.max(num1,num2);
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }

    }
}
