package main;

public class NumberOfDigitsInNumber{

    public static void main(String[] args) {
        
        System.out.println(CountDigits(1234567890));
    }
    static int CountDigits(int number){
        // int count=0;
        // while(number!=0){
        //     number=number/10;
        //     ++count;
        // }
        // return  count;
        return (int) (Math.log10(number)+1);
        //this formula give answers in constant time
        // increasing its time complexity
    }
}