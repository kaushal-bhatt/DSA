public class primeNumber {
    public static void main(String[] args) {
        
        System.out.println(prime(37));
    }
    static boolean prime(int n){
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
                //further optimize to three time faster now
             }
         }
        return true;
    }
    /**time complexity is O(sqrt(n))  see two three times why we did i*i<=n   */
}
