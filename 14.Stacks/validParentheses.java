import java.util.Stack;

public class validParentheses {

    public static boolean validPar(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                return false;
            }

            if (s.isEmpty()) {
                return true;
            }

            if ((s.peek() == '(') && str.charAt(i) == ')' ||
                    (s.peek() == '{' && str.charAt(i) == '}') ||
                    (s.peek() == '[' && str.charAt(i) == ']')) {

                s.pop();

            } else {
                return false;
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String arsg[]) {
        String str = "}{";
        System.out.println(validPar(str));
    }
}

// import java.util.Stack;
//
// public class validParentheses {
//
// public static boolean validPar(String str) {
// Stack<Character> s = new Stack<>();
//
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
// s.push(str.charAt(i));
// }
// }
//
// for (int i = 0; i < str.length(); i++) {
//
// if (s.isEmpty()) {
// return true;
// }
//
// if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
// s.pop();
// }
// }
//
// if (s.isEmpty()) {
// return true;
// }
//
// return false;
// }
//
// public static void main(String arsg[]) {
// String str = "(([([[(([{}])))(){{}}]]])))";
// System.out.println(validPar(str));
// }
// }
//
//
