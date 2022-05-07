

public class CountSetBits {
    public static void main(String[] args) {
        int n=40;
        int Result=0;
        System.out.print(Integer.toBinaryString(n)+"  have bits set =");
        while(n>0){
            n=(n&(n-1));
            Result++;
        }
        System.out.println(Result);
        
    }
}
