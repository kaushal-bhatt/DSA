package main;

import java.util.Arrays;


public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
        int[] arr1={1,2,35,4,6,7};
        int[] arr2={1,2,44,35,7};
        equalOrNot(arr1,arr2);
    }
    static void equalOrNot(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!= arr2.length){
            System.out.println("arrays are different");
            return;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("not a similar array");
                return;
            }

        }
        System.out.println("same array");

    }}


