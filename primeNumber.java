public class primeNumber {
    public static void main(String[] args) {
        
        System.out.println(prime(13));
    }
    static boolean prime(int n){
        if(n==1){
            return false;
        }
         for(int i=2;i*i<=n;i++){
             if(n%i==0 ){
                 return false;
             }
         }
        return true;
    }
    /**time complexity is O(sqrt(n))  see two three times why we did i*i<=n   */
}
