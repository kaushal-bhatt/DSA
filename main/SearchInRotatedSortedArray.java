package main;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] arr= {11,12,15,18,2,5,6,8};
        int start =0;
        int end = arr.length-1;
        int index=binarySearchModified(arr,start,end);
        int left = binarySearch(arr,90,start,index-1);
        int right =binarySearch(arr,90,index+1,end);
        if(left==-1 && right ==-1){
            System.out.println("element not found");
        } else if(left!=-1){
            System.out.println(left);
        }else{
            System.out.println(right);
        }
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

            }else{
                start= mid+1;

            }
        }
        return -1;
    }
    public static int binarySearchModified(int[] arr,int start,int end){
        int N=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;
            int next = (mid+1)%N;
            int previous = (mid-1+N)%N;
            //check if the element in the mid is the minimum element
            if(arr[mid]<=arr[next] && arr[mid]<=arr[previous]){
                return mid;
            }
            //if right half is unsorted ,search in the right half
            else if(arr[mid]<=arr[end]){
                end = mid-1;
            }
            //if the left half is unsorted search in left half
            else if(arr[mid]>=arr[start]){
                start=mid+1;
            }

        }
        //if array is not rotated
        return -1;

    }
}
