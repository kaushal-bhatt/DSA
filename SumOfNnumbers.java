public class SumOfNnumbers
{
 public static void main(String[] args) {
    System.out.println(sum(15));
} 
//Sum of n natural numbers can be defined as a form of arithmetic progression where the sum of n terms are arranged in a sequence with the first term being 1, n being the number of terms along with the nth term. The sum of n natural numbers is represented as [n(n+1)]/2.
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