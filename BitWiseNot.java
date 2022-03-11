public class BitWiseNot {
    
        public static void main(String[] args) {
            int i=-2;

            System.out.println(~-2);
            System.out.println(i<<2);
            //left shift formula to calculate value is x*2^y

            System.out.println(i>>2);
            //right shift formula is x/2^y  ,for any negative number we alway get negative result 
            //
            //  >>> is know as unsigned right shift, unsigned right shift will give positive number and huge number of small
        }
}
