package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRightShift {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
//        List<Integer> list=new ArrayList<>();
//        for(int n:arr){
//            list.add(n);
//        }
//        int last=list.get(list.size()-1);
//        list.remove(list.size()-1);
//        list.add(0,last);
//        System.out.println(Arrays.toString(list.toArray()));

        int arrayLast=arr[arr.length-1];
        System.arraycopy(arr,0,arr,1,arr.length-1);
        arr[0]=arrayLast;
        System.out.println(Arrays.toString(arr));
    }
}
