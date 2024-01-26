
/*
        

    Example 3: 1941. Check if All Characters Have Equal Number of Occurrences

    Given a string s, determine if all characters have the same frequency.

    For example, given s = "abacbc", return true. All characters appear twice. 
    Given s = "aaabb", return false. "a" appears 3 times, "b" appears 2 times. 3 != 2.

 */

import java.util.*;

public class OccurrenceFrequency {

    static boolean areOccurrenceEqual(String text){

        Map<Character, Integer> counts = new HashMap<>();

        for(char c : text.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }


        Set<Integer> frequencies = new HashSet<>(counts.values());

        System.out.println("value of frequencies: " + frequencies);

        return frequencies.size() == 1;

    
    }

    public static void main(String[] args) {

        String text = "abacbcd";

        boolean result = areOccurrenceEqual(text);

        System.out.println(result);
        
    }

    
}
