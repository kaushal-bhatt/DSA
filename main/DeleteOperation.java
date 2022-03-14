package main;


import java.util.Arrays;

public class DeleteOperation {
    public static void main(String[] args) {

        int [] arr= {3, 8, 12, 5, 6};

        int number=12;
        int n=5;

        System.out.println(Arrays.toString(arr));
        delete(arr,n,number);
        System.out.println(Arrays.toString(arr));
         for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");}

    }
    static int delete(int[] arr, int n, int number){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==number)
                break;}
        if(i==n){
            return n;
        }
        for (int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
    }
}
