public class ComputationPower {
    public static void main(String[] args) {
        System.out.println(compute(4,3));
    }
    static int compute(int number,int n){
        if(n==0){
            return 1;
        }
        int temp=compute(number, n/2);
         temp=temp*temp;
        if(n%2==0){
            return temp;
        }
        else
        {
            return temp*number;
        }
    }
    
}
