import java.util.*;

public class nextSmaller {

    public static int[] nxtSmaller(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nxtSmall[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtSmall[i] = -1;
            } else {
                nxtSmall[i] = arr[s.peek()];
            }

            s.push(i);
        }

        return nxtSmall;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int result[] = nxtSmaller(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
