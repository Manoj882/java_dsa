/* 
    Question:

    Sort an Array consisting of only 0s and 1s.

    Example 1:

    input1: [1, 0, 0, 1, 0, 1, 1, 0, 0]

    output1: [0, 0, 0, 0, 0, 1, 1, 1, 1]

    Example 2:
    
    input1: [0, 0, 1, 1, 0, 0, 1, 1];

    output1: [0, 0, 0, 0, 1, 1, 1, 1]

    

    
 */

import java.util.Arrays;

public class SortArray {

    static void swap(int[] arr, int left, int right){
        int temp = arr[left];

        arr[left] = arr[right];
        arr[right] = temp;

    }

    static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        int zerosCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zerosCount++;
            }

        }

        for(int i = 0; i < n; i++){

            if(i < zerosCount){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }


    }

    static void sortArrayUsingTwoPointer(int[] arr){
    
        int n = arr.length;
        int left =0, right = n - 1;

        
            while(left < right){
                if(arr[left] == 1 && arr[right] == 0){
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] == 0){
                    left++;
                }
                if(arr[right] == 1){
                    right--;
                }
            }
        
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};

        //sortZerosAndOnes(arr);

        sortArrayUsingTwoPointer(arr);

        System.out.println(Arrays.toString(arr));
        

    }
    
}
