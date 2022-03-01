public class Panagram {
    private static final String IT_IS_NOT_A_PANAGRAM = "It is not a Panagram";
    private static final String IT_IS_A_PANAGRAM ="it is panagram";
    public static void main(String[] args) {
        if(solve("The quick brown ox jumps over the lazy dog")==true){
            System.out.println(IT_IS_A_PANAGRAM);
        }
        else{
            System.out.println(IT_IS_NOT_A_PANAGRAM);
        }
    }
    static boolean solve(String str){
            boolean[] mark=new boolean[26];
            int index=0;
            for(int i=0;i<str.length();i++){
                if('A'<=str.charAt(i) && str.charAt(i)<='Z'){
                    index=str.charAt(i)-'A';
                }else if('a'<=str.charAt(i) && str.charAt(i)<='z'){
                    index=str.charAt(i)-'a';
                } else{ 
                continue;}
                mark[index]=true;
            }
            for(int i=0;i<=25;i++){
                if(mark[i]==false)
                return false;
            }
        return true;
    }
}