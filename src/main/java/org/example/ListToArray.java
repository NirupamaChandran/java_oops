package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(list);

//        System.out.println(Arrays.toString(list.toArray()));


        String[] array= new String[]{Arrays.toString(list.toArray())};
        for(String str:array){
//            System.out.println(str);
        }

        Integer[] arr=list.toArray(new Integer[list.size()]);
//        System.out.println(Arrays.toString(arr));


        int[] numbers = {1, 2, 3, 4, 5};
//        String[] numbersAsString = new String[]{Arrays.toString(numbers)};  this needs for loop to print array
        String numbersAsString = Arrays.toString(numbers);
        System.out.println(numbersAsString);

    }
}
