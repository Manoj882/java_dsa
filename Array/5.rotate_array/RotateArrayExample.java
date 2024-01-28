/*
    Question:

    Rotate the given array 'a' by k steps, where k
    is non-negative.

    Note: k can be greater than n as well.
    Here, n = input size of array

 */

import java.util.Arrays;

public class RotateArrayExample {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];

        int j =0;

        for(int i = n-k; i < n; i++){ // from (n-k) to (n-1)
            ans[j++] = arr[i];
        }

        for(int i =0; i < n-k; i++){ // from 0 to (n-k-1)
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;

        int[] output = rotate(arr, k);

        System.out.println(Arrays.toString(output));
        
    }
    
}
