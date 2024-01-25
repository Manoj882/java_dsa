/*
 Question: 
    Given an array nums containing n distinct numbers in the range [0, n], 
    return the only number in the range that is missing from the array.


 Example:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
    2 is the missing number in the range since it does not appear in nums.

 */

import java.util.*;

public class MissingNumber {

    public static int missingNumber(int[] nums){

        int ans = -1;

        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            set.add(num);
        }

        System.out.println("set value: " + set);

        int n = nums.length;

        for(int i = 0; i <= n; i++){
        
            if(!set.contains(i)){
                ans = i;
                break;

            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        int result = missingNumber(nums);

        System.out.println(result);

     }
    
}
