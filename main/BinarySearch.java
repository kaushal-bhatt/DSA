package main;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5,6,7,8,9};
        int start=0;int end=arr.length-1;
        System.out.println(binarySearch(arr,11,start,end));
    }
    public static int binarySearch(int[] arr,int searchElement,int start,int end){

        int mid;
        while(start<=end){
           mid=start+(end-start)/2;
           if(arr[mid]==searchElement){
               return mid;
           }
           else if(searchElement<arr[mid]){
               end= mid-1;
               binarySearch(arr,searchElement,start,end);
           }else{
               start= mid+1;
               binarySearch(arr,searchElement,start,end);
           }
        }
        return -1;
    }
}
