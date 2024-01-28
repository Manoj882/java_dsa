
/*
    Question:

    Find the unique number in a given Array where all the
    elements are being repeated twice with one value being 
    unique.

    Condition: Only positive elements in array

    input: [1, 2, 3, 4, 2, 1, 3]
    output: 1;
 */

import java.util.Arrays;

public class UniqueNumber {

    static int uniqueNumber(int[] arr){
        int uniqueNumber = -1;
        int n = arr.length;
        for(int i =0; i < n; i++){
        
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i =0; i < n; i++){
            if(arr[i] > 0){
                uniqueNumber = arr[i];
            }
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,2,1,3};

        int output = uniqueNumber(input);

        System.out.println(output);
    }
    
}
