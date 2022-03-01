public class trailinZeroInFactorial {
    public static void main(String[] args) {
        int sum=0;
        int number=100;
        for(int i=5;i<=number;i=i*5){
            sum=sum+(number/i);
        }
        System.out.println(sum);
    }
    /**
     * this is the best optimized solution, normal solution will be like first calculate the 
     * factorial and then find the zero by iterating over while loop and divide it with 10
     */
}
