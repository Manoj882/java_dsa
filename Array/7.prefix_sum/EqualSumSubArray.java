
/*
    Check if we can partition the array into two subarrays with equal sum.
    More formally, check that the prefix sum of a part of the array is equal
    to the suffix sum of rest of the array.

    EXample 1:

    Input:
    arr = [5, 3, 2, 6, 3, 1];

    Output: true 

    Explanataion:

    5 + 3 + 2 = 6 + 3 + 1
    10 = 10 (true)
    

 */



public class EqualSumSubArray {

    static int findArraySum(int[] arr){
        int totalSum = 0;

        for(int i =0; i < arr.length; i++){
            totalSum += arr[i];
        }

        return totalSum;
    }

    static boolean equalSumPartition(int[]arr){

        int n = arr.length;

        int totalSum = findArraySum(arr);

        int prefSum = 0;

        for(int i =0; i < n; i++){
            prefSum += arr[i];

            int suffixSum = totalSum - prefSum;

            if(suffixSum == prefSum){
                return true;
            }
        }

    
        return false;
    }

    public static void main(String[] args) {

        int[] input1 = {5, 3, 2, 6, 3, 1};

        int[] input2 = {1, 3, 2, 4, 5};

        boolean output1 = equalSumPartition(input1);

        boolean output2 = equalSumPartition(input2);

        System.out.println(output1);
        
        System.out.println(output2);
    }
    
}



