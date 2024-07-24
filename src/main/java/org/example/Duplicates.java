package org.example;

import java.util.Arrays;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        words.stream().distinct().forEach(System.out::println);
    }
}
