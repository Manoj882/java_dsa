/*

    Example 2: 2248. Intersection of Multiple Arrays

    Given a 2D array nums that contains n arrays of distinct integers, 
    return a sorted array containing all the numbers that appear in all n arrays.

    For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], 
    return [3, 4]. 3 and 4 are the only numbers that are in all arrays.

 */

import java.util.*;

public class IntersectionOfArrays {

    public static List<Integer> intersection(int[][] nums){
        Map<Integer, Integer> counts = new HashMap<>();

        for(int[] arr: nums){
            for(int num : arr){
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
        }

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int key: counts.keySet()){
            if(counts.get(key) == n){
                ans.add(key);
            }
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        
        List<Integer> result = intersection(nums);

        System.out.println(result);
    }
    
}

