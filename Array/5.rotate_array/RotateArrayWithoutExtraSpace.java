/*
    Question:

    Rotate the given array 'a' by k steps, where k is non negative
    number without using extra space.

    Note: k can be greater than n as well.

    // Use - In-place concept : use same array which is passed as an input in function

    input: [1,2,3,4,5,6,7]

    int n = 7;
    int k = 5; (number of rotation)

    output: [3,4,5,6,7,1,2];
 */

import java.util.Arrays;

public class RotateArrayWithoutExtraSpace {

    static void printArray(int[] arr){
        int n = arr.length;

        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){

        while( i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    

    static void rotateInPlace(int[]arr, int k){
        
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - k -1);

        reverse(arr, n - k, n -1);

        reverse(arr, 0, n-1);
    }




    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int k = 3;

        rotateInPlace(arr, k);

       System.out.println(Arrays.toString(arr));

      // printArray(arr);
    }
    
}
