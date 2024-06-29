
public class StringCompression {

    public static String toCompress(String str){
        StringBuilder sb = new StringBuilder("");
        int Count = 0;
       
        for(int i = 0; i < str.length(); i++){
            Count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                Count++;
                i++;
            }

            sb.append(str.charAt(i));
            if( Count > 1)sb.append(Count);
            
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(toCompress(str));
    }    
}
