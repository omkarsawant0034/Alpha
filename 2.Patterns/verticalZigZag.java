public class verticalZigZag {

    public static void zigZag(int n) {
        for (int i = 0; i < n; i++) {
            // Determine how many spaces to print based on the current row
            int spaces = (i % 4 == 2) ? 4 : (i % 4 == 1 || i % 4 == 3) ? 2 : 0;

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print
            System.out.println("*");
        }
    }

    public static void main(String args[]) {
        zigZag(6); // Change n to 6 for the given example pattern
    }
}
