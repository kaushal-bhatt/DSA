package main;
public class reecurse{
public static void main(String[] args) {

    int n=3;
    System.out.print(recursion(n));

}
static int recursion(int n){
    if(n==0){
        return 1;
    }
    else if(n==1){
        return 1;
    }
    else{
        return n*recursion(n-1);
    }
}
}