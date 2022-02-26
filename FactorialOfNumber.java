public class FactorialOfNumber {
    
    public static void main(String[] args) {
        System.out.println(factorialNumber(10));
    }
    static int factorialNumber(int number){
            int result=1;
            for(int i=2;i<=number;i++){
                result=result*i;
            }
        return result;
    }
}
