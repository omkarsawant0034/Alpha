public class reverseInteger {
    
    public static int reverseNum(int x){

        int res = 0;
        while(x != 0){
            int digit = x % 10;
            x = x / 10;
            res = (res*10)+digit;
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(reverseNum(321));
    }
}
