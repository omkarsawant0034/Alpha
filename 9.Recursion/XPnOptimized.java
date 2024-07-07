//Do check out the notes if any confusion

public class XPnOptimized {

    public static int pow(int x,int n){
        
        if(n == 0) return 1;
        
        int halfPower = pow(x,n/2); // O(logn)
        int halfPowerSq = halfPower * halfPower;
        if((n%2) != 0){
            return x*halfPowerSq; 
        }
        
        return halfPowerSq;
    }
    public static void main(String args[]){
        int n = 10;
        int x = 2;
        System.out.println(pow(x,n));
    }
}

