import java.util.HashMap;
import java.util.Map;

public class ransomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        
        // Check if ransom note can be constructed from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false; // Character not available or used up
            }
            magazineMap.put(c, magazineMap.get(c) - 1); // Use one instance of the character
        }
        
        return true; // All characters are available
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa")); // Output: true
    }
}
 