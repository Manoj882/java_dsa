import java.util.*;

public class FindLongestSubString {

    public static int findLongestSubstring(String s, int k){

        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int ans = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            counts.put(c, counts.getOrDefault(c, 0) + 1);

            System.out.println("counts value: " + counts);

            while(counts.size() > k){
                char remove = s.charAt(left);
                counts.put(remove, counts.getOrDefault(remove, 0) - 1);
                if(counts.get(remove) == 0){
                    counts.remove(remove);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            
            
        }

        return ans;

    }

    public static void main(String[] args) {
        String input = "ececeba";
        int k = 2;

        int result = findLongestSubstring(input, k);
        System.out.println(result);
    }
    
}
