
public class printNumAsc {

    public static void NumInAsc(int n){
        if(n == 0) return;
        NumInAsc(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n = 10;
        NumInAsc(n);
    }    
}
