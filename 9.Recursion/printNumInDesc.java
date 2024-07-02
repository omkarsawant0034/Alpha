
public class printNumInDesc {

    public static int NumInDesc(int n){
        if(n == 0) return 0;
        System.out.println(n);
        return NumInDesc(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        NumInDesc(n);
    }    
}
