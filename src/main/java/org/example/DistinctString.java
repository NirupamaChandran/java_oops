package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctString {
    public static void main(String[] args) {
        String[] str= {"pear","banana","apple","orange","cherry","anu"};
        List<String> list= new ArrayList<String>();

        for(String s:str){
            Set<Character> set= new HashSet<Character>();
            for(char c:s.toCharArray()){
                set.add(c);
            }
            if(set.size()==s.length()){
                list.add(s);
            }
        }
        System.out.println(list);
    }
}
