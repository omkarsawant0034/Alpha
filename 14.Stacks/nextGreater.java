import java.util.*;

public class nextGreater {

    public static int[] nxtGreater(int[] arr) {

        Stack<Integer> s = new Stack<>();
        int nxtGtr[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGtr[i] = -1;
            } else {
                nxtGtr[i] = arr[s.peek()];
            }

            s.push(i);
        }

        return nxtGtr;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int result[] = nxtGreater(arr);

        for (int i : result) {
            System.err.print(i + " ");
        }
    }
}

// next Greater Right
// next Greater Left
// next Smaller Right
// next Smaller Left
