import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter the number :");
            String a= s.nextLine();
            int number = Integer.parseInt(a);
      new primeFactor().primeFactors(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    void primeFactors(int n){
        if(n<=1){
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                System.out.print(i+ " ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}
