package main;

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
        // if(n<=1){
        //     return;
        // }
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     while(n%i==0){
        //         System.out.print(i+ " ");
        //         n=n/i;
        //     }
        // }
        // if(n>1){
        //     System.out.println(n);
        // }

        //above is one solution 
        //below is more optimize solution
        if(n<=1) return;
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3+" ");
            n=n/3;
        }
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print(i+2 + " ");
                n=n/(i+2);
            }
            
        }
        if(n>3)System.out.print(n+" ");

    }
}
