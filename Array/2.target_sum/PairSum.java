/*
    Question 1:

    Find the total number of pairs in the Array
    whose sum is equal to the given value x.

    target = 7;

    input : [4,6,3,5,8,2]

    // output: 2 [(4,3). (5,2)]


    Note: Here, pairs means two element 
    
    

 */

public class PairSum {

    // Using Bruteforce

    static int totalNumberOfPairSum(int[] nums, int target){
        int counts = 0;

        for(int i =0; i < nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                int sum = 0;
                sum = nums[i] + nums[j];

                if(sum == target){
                    counts++;
                }

                // if(target == nums[i] + nums[j]){
                //     counts++;
                // }
            }
        }



        return counts;
    }

    public static void main(String[] args) {

        int[] input = {4,6,3,5,8,2};
        int target = 7;

        int output = totalNumberOfPairSum(input, target);

        System.out.println(output); // output: 2 if target = 7
        
    }
    
}
