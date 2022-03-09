public class KthBitSetOrNot {
    
    public static void main(String[] args) {
        kthBitsetChecker(15, 2);
        kthBitsetCheckers(15,2);
    }
    // Kth bit set or not via LEFT SHIFT operator (<<)
    static void kthBitsetChecker(int number,int KthBit){
        if((number & (1<<(KthBit-1))) !=0 ){
            System.out.println((number & (1<<(KthBit-1))));
            System.out.println("VIA LEFT SHIFT ::"+"SET");
        }
        else{
        System.out.println("VIA LEFT SHIFT ::"+"NOT SET");
            }
    }
    static void kthBitsetCheckers(int number,int KthBit){
        if(((number>>(KthBit-1))&1)==1 ){
            
            System.out.println("VIA RIGHT SHIFT ::"+"SET");
        }
        else{
        System.out.println("VIA LEFT RIGHT ::"+"NOT SET");
            }
    }

}
