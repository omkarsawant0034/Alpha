class validPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", ""); // Remove spaces

        StringBuilder filtered = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                filtered.append(c);
            }
        }

        String filteredString = filtered.toString();
        int i = 0;
        int j = filteredString.length() - 1;

        while(i < j){
            if(filteredString.charAt(i) != filteredString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String args[]){
        String str = "NAYAN";
        System.out.println(isPalindrome(str));
    }
}
