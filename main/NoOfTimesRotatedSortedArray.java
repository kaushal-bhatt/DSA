package main;


public class NoOfTimesRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= {11,12,15,18,2,5,6,8};
        int start =0;
        int end = arr.length-1;
        System.out.println(binarySearchModified(arr,start,end));
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
