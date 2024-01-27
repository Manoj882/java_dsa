import java.util.Arrays;

public class CopyArray {

    static void printArray(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int [] arr = new int[5];

        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 8;
        arr[3] = 7;
        arr[4] = 2;

        System.out.println("Original Array");
        printArray(arr);

        System.out.println("Copied array");

        //int [] arr2 = arr; // it also changes original array

        //int[] arr2 = arr.clone();

        //int[] arr2 = Arrays.copyOf(arr, arr.length);

        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);

        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original array after changing arr2");
        printArray(arr);

        System.out.println("Copied array after changing arr2");
        printArray(arr2);
     }
    
}
