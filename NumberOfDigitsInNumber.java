public class NumberOfDigitsInNumber{

    public static void main(String[] args) {
        
        System.out.println(CountDigits(100));
    }
    static int CountDigits(int number){
        int count=0;
        while(number!=0){
            number=number/10;
            ++count;
        }
        return  count;
    }
}