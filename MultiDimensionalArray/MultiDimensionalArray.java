import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    

    static void printSingleArray(int[] arr){
        int n = arr.length;

        for(int i =0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void printMutiDimenArray(int[][] arr){ 

        for(int i =0; i < arr.length; i++){ // row

            for(int j = 0; j < arr[i].length; j++){ // column
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }




    public static void main(String[] args) {

        // int[] oneDimensionArray = {1,2,3,4,5};

        // int[][] multiDimenArray = {{1,2,3},{4,5,6}, {7,8,9}};

        // // printSingleArray(oneDimensionArray);

        // printMutiDimenArray(multiDimenArray);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");

        int r = sc.nextInt();

        System.out.println("Enter number of columns");

        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r * c + " elements");

        for(int i =0; i < r; i++){

            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }

        }

        printMutiDimenArray(arr);

        
        
    }
}
