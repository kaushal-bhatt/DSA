package main;

public class FirstOccurrence {

    public static void main(String[] args) {
        int[] arr= {1,2,3,3,3,5,6};

        int start=0;
        int end=arr.length-1;
       System.out.println(binarySearch(arr,3,start,end));
    }
//    public FirstOccurrence(int[] arr, int start, int end, int searchElement){
//        this.arr= arr;
//        this.end=end;
//        this.start=start;
//        this.searchElement= searchElement;
////        return binarySearch(arr,searchElement, start, end);
//    }
    public static int binarySearch(int[] arr,int searchElement, int start,int end){
        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(searchElement==arr[mid]){
                result=mid;
                end=mid-1;

            } else if (searchElement<arr[mid]) {
                end=mid-1;

            }else{
                start= mid+1;

            }
        }


        return result;
    }
}
