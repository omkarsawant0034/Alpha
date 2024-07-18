class ZigZag {
        public static String convert(String s, int numRows) {
            if (numRows == 1) return s; // No conversion needed if numRows is 1
    
            StringBuilder[] ans = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                ans[i] = new StringBuilder();
            }
    
            int i = 0;
            int len = s.length();
    
            while (i < len) {
                for (int idx = 0; idx < numRows && i < len; idx++) { // Vertically down
                    ans[idx].append(s.charAt(i++));
                }
                for (int idx = numRows - 2; idx >= 1 && i < len; idx--) { // Obliquely up
                    ans[idx].append(s.charAt(i++));
                }
            }
    
            StringBuilder res = new StringBuilder();
            for (StringBuilder str : ans) {
                res.append(str);
            }
    
            return res.toString();
        }
    
    public static void main(String args[]){
        String result = convert("PAYPALISHIRING",4);
        System.out.println(result);
    }
}