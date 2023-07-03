package main;
//count occurrence of number in sorted array
public class CountOccurrenceOfNumber {
    public static void main(String[] args) {
        int[] arr= {2,3,3,3,3,3,4,5,6,7};
        int start =0;
        int end=arr.length-1;
        int first = binarySearch(arr,3,start,end,true);
        int last = binarySearch(arr,3,start,end,false);
        System.out.println(last-first+1);
    }


    public static int binarySearch(int[] arr,int searchElement, int start,int end,boolean first){
        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(searchElement==arr[mid]){
                result=mid;
                if(first){
                end=mid-1;}else{
                    start=mid+1;
                }
                binarySearch(arr,searchElement,start,end,first);
            } else if (searchElement<arr[mid]) {
                end=mid-1;
                binarySearch(arr,searchElement,start,end,first);
            }else{
                start= mid+1;
                binarySearch(arr,searchElement,start,end,first);
            }
        }
       return result;
    }

}
