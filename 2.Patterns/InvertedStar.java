public class InvertedStar {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++){
            for(int col = 1; col <= 4-line+1; col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
