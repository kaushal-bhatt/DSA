package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};
        List<Integer> arrr=  Arrays.asList(arr);
        Collections.reverse(arrr);
        for(Object i :arrr){
        System.out.print(i.toString()+" ");
        }
        Integer[] arr2={1,2,3,4,5,6};
        reverse(arr2);
    }
    static void reverse(Integer [] arr){
        int first=0;//low
        int last=(arr.length)-1;//high
        int temp;
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println("\n"+Arrays.toString(arr));
    }
}
