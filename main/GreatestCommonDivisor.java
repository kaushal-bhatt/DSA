package main;

public class GreatestCommonDivisor{
    public static void main(String[] args) {
        System.out.println(solution(100,1400));
    }
    /**
     * main.GreatestCommonDivisor is
     * some number which is the heighest
     *  number that divides both numbers
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    // public static int solution(int firstNumber,int secondNumber){
    //     while(firstNumber!=secondNumber){
    //         if(firstNumber>secondNumber)
    //         firstNumber=firstNumber-secondNumber;
    //         else
    //         secondNumber=secondNumber-firstNumber;
    //     }
    //     return firstNumber;
    // }

    //best solution is below one above one is good but not the best so check this one
    public static int solution(int firstNumber,int secondNumber){
        if(secondNumber==0)
        return firstNumber;
        else
            return solution(secondNumber,firstNumber%secondNumber);
    }

}