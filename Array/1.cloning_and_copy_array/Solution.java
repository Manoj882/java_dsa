import java.util.Arrays;

public class Solution {

    // static int countOccurrence(int[] nums, int num){
    //     int countFreq = 0;

    //     for(int i =0; i < nums.length; i++){
    //         if(num == nums[i]){
    //             countFreq++;
    //         }
    //     }

    //     return countFreq;
    // }

    // static int lastOccurrence(int[] nums, int num){
    //     int ans = -1;

    //     for(int i =0 ; i < nums.length; i++){
    //         if(num == nums[i]){
    //             // ans = Math.max(ans, i);
    //             ans = i;
    //         }
    //     }

    //     return ans;
    // }

    // static boolean isSorted(int[] nums){
    //     boolean ans = true;

    //     for(int i =1; i < nums.length; i++){
    //         if(nums[i] < nums[i-1]){
    //             ans = false;
    //             break;
    //         }
    //     }

    //     return ans;

    // }

    static int[] smallestAndLargestElement(int[] nums){
        

        Arrays.sort(nums);

        int[] ans = {nums[0], nums[nums.length - 1]};
 
        return ans;
    }
    

    public static void main(String[] args) {

        // int[] nums = {5,6,5,3,5,4};
        int[] nums = {1,5,5,5,6,7,8,2};
        int num = 5;

        //int output = countOccurrence(nums, num);

        //int output = lastOccurrence(nums, num);

        //boolean output = isSorted(nums);

        int[] output = smallestAndLargestElement(nums);
        System.out.println(Arrays.toString(output));
        
    }
    
}
