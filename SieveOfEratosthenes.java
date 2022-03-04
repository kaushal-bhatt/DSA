import java.util.Arrays;


public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveOfEratosthenes a= new SieveOfEratosthenes();
        a.solution(10);
        /**here time complexity is O(nloglogn) */
    }
     void solution(int n){
        if(n<=1)
        return;
        boolean isPrime[]= new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        
    }
    static boolean isprime(int n)
    {
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 ||n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
        
    }
    
}
