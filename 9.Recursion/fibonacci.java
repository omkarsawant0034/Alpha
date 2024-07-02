class fibonacci{

    public static int fb(int n){
        if(n == 0 || n == 1) return n;

        int fnm1 = fb(n-1);
        int fnm2 = fb(n-2);
        
        System.out.print(fnm2+" ");
        int fb = fnm1 + fnm2;
        
        return fb;
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(fb(n));
    }
}