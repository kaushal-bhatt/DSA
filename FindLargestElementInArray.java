public class FindLargestElementInArray {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,13,4,4};
        long a=System.currentTimeMillis();

        System.out.println(" largest : "+solution(arr));
        System.out.println("second largest : "+ secondLargest(arr));
        long b=System.currentTimeMillis();
        System.out.println("time taken to complete program " +(b-a));
    }
    static int solution(int[] arr){
       int max=arr[0];
        for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                    max=arr[i];
                }
        }

        return max;
    }
    //SecondLargest element in array
    static int secondLargest(int [] arr){
       int secondMax=-1;
       int max=0;

        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                secondMax=max;
                max=i;
            }
            else if (arr[i]!=arr[max]){
                if(secondMax==-1 || arr[i]>arr[secondMax]){
                    secondMax=i;
                }
            }
             }

        return arr[secondMax];
    }
}
