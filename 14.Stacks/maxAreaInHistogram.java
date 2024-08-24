import java.util.Stack;

public class maxAreaInHistogram {

    public static int[] nextGtrLeft(int heights[]) {
        Stack<Integer> s = new Stack<>();
        int nxtGtrLeft[] = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {

            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGtrLeft[i] = -1;
            } else {
                nxtGtrLeft[i] = s.peek();
            }

            s.push(i);
        }

        return nxtGtrLeft;
    }

    public static int[] nextGtrRight(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int nxtGtrRight[] = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGtrRight[i] = heights.length;
            } else {
                nxtGtrRight[i] = s.peek();
            }

            s.push(i);
        }

        return nxtGtrRight;
    }

    public static int maxAreaHist(int[] heights) {

        int nxtGtrLeft[] = nextGtrLeft(heights);
        for (int i : nxtGtrLeft) {
            System.out.print(i + " ");
        }

        System.out.println();

        int nxtGtrRight[] = nextGtrRight(heights);
        for (int i : nxtGtrRight) {
            System.out.print(i + " ");
        }
        System.out.println();

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nxtGtrRight[i] - nxtGtrLeft[i] - 1;
            // int currArea = heights[i] * (nxtGtrRight[i] - nxtGtrLeft[i] - 1);
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxAreaHist(heights));
    }
}
