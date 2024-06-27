public class halfPyramid{
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++){
            for(int col = 1; col <= line; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

