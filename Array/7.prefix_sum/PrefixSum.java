
/*
    Question:

    Given an integer array 'a', return the prefix sum / running sum in the 
    same array without creating a new array.

    Example 1:

    input 1: [2, 1, 3, 4, 5]

    output 1: [2, 3, 6, 10, 15]  --> prefix/ running sum
 */

import java.util.Arrays;

public class PrefixSum {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;

        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];

        for(int i =1; i < n ; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        return prefixSum;
    }

    static int[] makePrefixSumWithoutCreatingNewArray(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i - 1];
        }

    

        return arr;
    }

    public static void main(String[] args) {

        int [] arr = {2, 1, 3, 4, 5};

        int[] output1 = makePrefixSumArray(arr);

        int[] output2 = makePrefixSumWithoutCreatingNewArray(arr);

        System.out.println(Arrays.toString(output2));
        
    }
    
}
