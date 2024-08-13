class reverseString {
    public static String rev(String str) {
        int i = 0;
        int j = str.length() - 1;
        char arr[] = str.toCharArray();
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String args[]) {
        String str = "hello";
        System.out.println(rev(str));
    }
}