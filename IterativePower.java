public class IterativePower {
    public static void main(String[] args) {
        System.out.println(compute(4,3));
    }
    static int compute(int x,int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
                res=x*res;
            }
            else{
                return 0;
            }
            n=n>>1;
            x=x*x;
        }
        return res;
        //time complexity is O(log n) and Auxillary space O(1)
    }
}
