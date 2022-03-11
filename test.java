public class test {
 public static void main(String[] args) {
     int N=12;
     int arr[]={9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
     fun(arr,N);
     
 }   
 static int fun(int arr[], int n)

{

    int x = arr[0];

    for (int i = 1; i < n; i++)

        x = x ^ arr[i];

    return x;

}
}
