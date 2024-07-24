package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) {
        String s = "java collections and arrays";
        String[] arr = s.split(" ");
        List<String> str= Arrays.stream(arr)
                .map((a) -> new StringBuilder(a).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(str);
    }
}
