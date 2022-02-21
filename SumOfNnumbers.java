public class SumOfNnumbers
{
 public static void main(String[] args) {
    System.out.println(sum(15));
} 

static int sum(int n){
    //the return statment which is not commented is the formula to calculate the sum of natural numbers
    //one more apprach we can do which is by iterating upto to the n numbers and add each number on single iteration
    /*
    int sum=0;
    for(int i=0;i<=n;i++){
        sum=sum+i;
    }
    return sum;
    */
    return n*(n+1)/2;

}
}