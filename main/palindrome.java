package main;

public class palindrome {
    
    public static void main(String[] args) {
        System.out.println("Given number is plaindrome or not:"+returnPalindrome(363));
        
    }
    static boolean returnPalindrome(int number){
        int rev=0;
        int temp=number;
        while(temp!=0){
            int lastDigit =temp%10;
            rev=rev*10+lastDigit;
            temp=temp/10;
        }
        return (rev==number);
}
}
