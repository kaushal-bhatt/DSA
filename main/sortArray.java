package main;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int []arr={1,4,2,3,2};
        System.out.println(sort(arr));

    }
    static boolean sort(int [] arr){

        for(int i=1;i<arr.length;i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
                return true;



    }

}
