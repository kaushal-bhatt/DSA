public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmSolution(20,6));
    }
    static int gcd(int firstNumber,int secondNumber){
     if(secondNumber==0)
        return firstNumber;
      return gcd(secondNumber,firstNumber%secondNumber);    

    }
    static int lcmSolution(int firstNumber,int secondNumber){
        return (firstNumber*secondNumber)/gcd(firstNumber, secondNumber);
    }
        /**time Complexity is log(min(a,b)) */
    }

