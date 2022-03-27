package main;

public class OddOcurrenceOfAnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,6,7,8,9,10,10};
        System.out.print(solution(arr));
    }
    static int res=0;
    //magic of xor operator ^ ,learn the properties of these

    static int solution(int arr[]){
       for(int i=0;i<arr.length;i++){
           res=res^arr[i];
       }
        return res;
    }
}
