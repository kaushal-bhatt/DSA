package main;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        divisorFinder(10);
    }
    static void divisorFinder(int n){
        ArrayList <Integer>a =new ArrayList<Integer>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                Object x=(Integer)i;
                a.add((Integer)x);
                if(i!=n/i){
                    int c=n/i;
                    Object y=(Integer)c;
                    a.add((Integer)y);
                    Collections.sort(a);
                    System.out.println(a);
                }
            }
        }
        return;
    }
    
}