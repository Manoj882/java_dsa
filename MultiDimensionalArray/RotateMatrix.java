
/*
    Question:

    Given a sqaure matrix, turn it by 90 degrees in a clockwise direction
    without using any extra space.

    Input:
    --------
    1 2 3
    4 5 6
    7 8 9

    Output:
    ----------
    7 4 1
    8 5 2
    9 6 3
 */

import java.util.Scanner;

public class RotateMatrix {

    static void printMatrix(int[][] matrix){
        for(int i =0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i =0; i < c; i++){
            for(int j =i; j < r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    static void reverseArray(int[] arr){

        int i = 0, j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotateMatrix(int[][]matrix, int n){
    
        // transpose
    
        transposeInPlace(matrix, n, n);

        // reverse each row of transposed matrix

       for(int i = 0; i < n; i++){
        reverseArray(matrix[i]);
       }

       printMatrix(matrix);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and column of matrix: ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int totalElements = r * c;

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + totalElements + " values for matrix");

        for(int i =0; i < r; i++){
            for(int j =0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix: ");
        printMatrix(matrix);

        System.out.println("Rotate Matrix: ");

        rotateMatrix(matrix, r);
        
    }    
}
