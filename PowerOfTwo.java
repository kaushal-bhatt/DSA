public class PowerOfTwo {
    public static void main(String[] args) {
        
        int n=243124;
        int Result=0;
        if(n==0){
            System.out.println(n +" is not a power of two");
        }
        while(n>0){
            n=(n&(n-1));
            Result++;
        }
        if(Result==1){System.out.println("Yes it is a power of two");}
        else{
        System.out.println(Result+" is not a power of two");
        
    }
    }
}
