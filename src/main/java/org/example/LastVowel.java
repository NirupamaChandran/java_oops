package org.example;

public class LastVowel {
    public static void main(String[] args) {
        String[] arr={"banana","book","orange","apple","balloon","bee"};
        int count=0;
        for(String str:arr){
            int last=str.length()-1;
            if(str.charAt(last)=='a' || str.charAt(last)=='e' || str.charAt(last)=='i' || str.charAt(last)=='o' || str.charAt(last)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
