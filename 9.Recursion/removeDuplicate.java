public class removeDuplicate {
    
    public static void Duplicate(String str,int idx,StringBuilder newStr,boolean map[]){

        if( idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            Duplicate(str, idx+1, newStr, map);
        } else{
            map[currChar - 'a'] = true;
            Duplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {

        Duplicate("ommmkaarrrrr", 0, new StringBuilder(""), new boolean[26]);
    }
}
