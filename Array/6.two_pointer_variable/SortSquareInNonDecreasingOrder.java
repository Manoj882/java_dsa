
/*
    Question:

    Given an integer array 'a' sorted in non-decreasing
    order, return an array of the squares of each number 
    sorted in non-decreasing order.

    Example of non-decreasing order: 1,2,2,3

    Example of increasing order: 1,2,3,4

    Example 1:
    ---------------
    Input1: [2 , 4, 6, 7, 10]
    Output1: [4, 16, 49, 100]

    Example 2:
    ---------------
    Input2: [-10, -3, -2, 1, 4, 5]

    Square: [100, 9, 4, 1, 16, 25] // it is not non-decreasing order

    Output: [1, 4, 9, 16, 25]


 */

import java.util.Arrays;

public class SortSquareInNonDecreasingOrder {

    static void swap(int[]arr, int left, int right){
        int temp = arr[left] ;
        arr[left] = arr[right];
        arr[right] = temp;

    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int[]arr){
        int n = arr.length;

        int left =0, right = n - 1;

        // int k = 0;
        int k = n - 1;
        
        int[] ans = new int [n];

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                // ans[k++] = arr[left] * arr[left];
                // left++;

                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else {
                // ans[k++] = arr[right] * arr[right];
                // right--;

                ans[k--] = arr[right] * arr[right];
                right--;
            }
            
        }


        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {-10, -3, -2, 1, 4, 5};

        int[] square = sortSquares(arr);

        //reverse(square);


        
        System.out.println(Arrays.toString(square));


        
        
    }
    
}
