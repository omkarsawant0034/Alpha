
    // LeetCode
    public class lastWordLeng {
        public static int lengthOfLastWord(String s) {
            int length = 0;
            for(int i = s.length()-1; i >= 0; i--){
                if(s.charAt(i) == ' '){
                    break;
                }
                length++;
            }
            return length;
        }
        public static void main(String args[]){
            String s = "Hello World";
            System.out.println(lengthOfLastWord(s));
        }
    }

