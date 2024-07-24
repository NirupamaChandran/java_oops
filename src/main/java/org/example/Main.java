package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        char c='b',b='a';
//        System.out.println(c-b);

        String[] arr={"ab","bbcc","c","d"};

        int total=0;
        for(String s:arr){
            List<Integer> curVal=new ArrayList<>();
            int sum=0;
            for(char c:s.toCharArray()){
                curVal.add(c-'a'+1);
            }
            Collections.sort(curVal);
            System.out.println(curVal);
            if(curVal.size()<6){
                for(int i:curVal){
                    sum+=i;
                }
            }
            else {
                for(int i=0;i<6;i++){
                    sum+=curVal.get(i);
                }
            }
            total+=sum;
        }
        System.out.println(total);
    }
}