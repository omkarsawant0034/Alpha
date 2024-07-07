public class tilingProb {
 
    public static int tiling(int n){ // 2 * n (floor size)

        if(n == 0 || n == 1) return 1;
        int vertical = tiling(n-1); 
        int horizontal = tiling(n-2);
        int totalWays = vertical + horizontal;
        return totalWays; 
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tiling(n));
    }   
}
