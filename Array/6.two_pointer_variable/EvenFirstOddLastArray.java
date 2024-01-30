/*
    Question:

    Given an array of integers 'a', move all the even integers
    at the beginning of the array followed by all the odd integers.
    The relative order of odd or even integers does not matter. Return
    any array that satisfies the condition.

    input: [1,2,3,4,5,6,7]

    output: [2, 4, 6, 1, 3, 5, 7]

 */

import java.util.Arrays;

public class EvenFirstOddLastArray {


    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    static void sortArrayByParity(int[] arr){  // even parity first and ordd parity last
        
        int n = arr.length;
        int left =0, right = n - 1;

        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8};

        sortArrayByParity(input);

        System.out.println(Arrays.toString(input));
        
    }
    
}
