package main;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="geeksforgeeks";
      int index=  repetitive(s);
        System.out.println(s.charAt(index));
    }
    static final int No_of_chars=256;
    static  char count[]=new char[No_of_chars];
    static int repetitive(String str){
        getCharCount(str);
        int index=-1,i;
        for( i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                index=i;
                break;
            }
        }
        return index;
    }
    static void getCharCount(String str){
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
    }
}
