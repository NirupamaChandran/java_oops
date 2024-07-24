package org.example;

public class lexicographically {

    public static String calculateString(int N, String Str, int D, int K) {
        StringBuilder sb=new StringBuilder();
        int i=1;
        for(char c : Str.toCharArray()) {
            int ascii=(int)c;
            while (i<=K){
                if(ascii>(int)c){
                    sb.append(c);
                }
                ascii+=D;
                if(ascii>'z') {
                    ascii-=26;
                }
            }
        sb.append((char)ascii);
        i++;

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test case
        System.out.println(calculateString(2, "vy", 3, 3)); // Output: "bb"
    }
}


