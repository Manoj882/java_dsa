/*
    Question:

    Find the second largest element in the given array.

    input: [9,8,9,6,9,5,8]

    output: 8 // second largest element
 */

public class SecondLargestElement {

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        int n = arr.length;
        for(int i =0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }

        return max;
    }

    static int findSecondMax(int[] arr){
        int mx = findMax(arr);

        for(int i =0; i < arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    

    public static void main(String[] args) {
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        int[] input1 = {9,8,9,6,9,5,8};

        int[] input2 = {0, -2, 0, -3, -1, -4};

        // int output = findMax(input);

        int output1 = findSecondMax(input1);
        int output2 = findSecondMax(input2);

        System.out.println(output1);
        System.out.println(output2);
        


       
    }


    
}
