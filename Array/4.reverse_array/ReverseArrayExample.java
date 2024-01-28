import java.util.Arrays;


/*
    Note: In this example, array is reversed using new array so it takes extra space in memory
 */
public class ReverseArrayExample {

    // Method 1 : method for reverse array by creating new array and store value
    static int[] reverseArrayWithCreatingNewArray(int[] arr){

        int n = arr.length;

        int[] ans = new int[n];

        // int j =0;
        
        // // using for loop
        // // traversing original array in reverse direction

        // for(int i = n-1; i >= 0; i--){
        //    ans[j++] = arr[i]; // post increment fisrt assign the value and incremnt the j value

        //     // ans[j] = arr[i];
        //     // j++;
            
        // }

        // using while loop

        int i = n-1, j= 0;

        while(i >= 0){
            ans[j++] = arr[i--];
        }


        return ans;
    }

    // Method 2 : method for reversing array without creating new array
    // by using the swap technique by taking two pointer

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayWithoutCreatingNewArray(int[] arr){
        int i = 0, j = arr.length - 1;

        while(i < j){
            swapInArray(arr, i , j);
            i++;
            j--;
        }
    }
    

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};

        int[] output = reverseArrayWithCreatingNewArray(input);

        //System.out.println(Arrays.toString(output));
        
        reverseArrayWithoutCreatingNewArray(input);

        System.out.println(Arrays.toString(input));
    }
}
