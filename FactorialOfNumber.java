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
    /**
     * recusrive approach for same problem , but it
     *  will take slightly more space to hold the
     *  previous state result till root
     */
//     static int factorialNumber(int number){
//         if(number==0)
//         return 1;
//     return number*factorialNumber(number-1);
// }
}
