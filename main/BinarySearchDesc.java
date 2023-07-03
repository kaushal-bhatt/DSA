package main;

public class BinarySearchDesc {
    public static void main(String[] args) {
        int[] arr={20,17,16,15,14,8};
        int start=0;
        int end=arr.length-1;
        System.out.println( binarySearch(arr,8,start,end));
    }
    public static int binarySearch(int[] arr,int searchElement, int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==searchElement){
                return mid;
            } else if (searchElement<arr[mid]) {
                start=mid+1;
                binarySearch(arr,searchElement,start,end);
            }
            else{
                end= mid-1;
                binarySearch(arr,searchElement,start,end);
            }
        }
        return -1;
    }
}
