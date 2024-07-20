import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            char sorted[] = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sortedWord = new String(sorted);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }

            map.get(sortedWord).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String args[]){
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}
