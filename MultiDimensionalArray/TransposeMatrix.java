/*
    Write a program to display transpose of matrix entered by the user.

    Input:
    
    1 2 3
    4 5 6
    7 8 9

    Output:

    1 4 7
    2 5 8
    3 6 9

    Note: In transpose, rows move into columns and columns move into rows
 */

import java.util.Scanner;

public class TransposeMatrix {

    static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

    }

    public static void printMatrix(int[][] matrix){
        for(int i =0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] findMatrix(int[][] matrix, int r, int c){

        int[][] ans = new int[c][r];  // after transpose, row becomes column and column becomes row

        for(int i =0; i < c; i++){ // here, row of transpose matrix is filled by column of given matrix
            for(int j =0; j < r; j++){  // here, column of transpose matrix is filled by rows of given matrix
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
        
    }

    static void transposeInPlace(int[][] matrix, int r, int c){

        for(int i =0; i < c; i++){
            for(int j =i; j < r; j++){

                swap(matrix, i, j);
                
                // swap matrix[i][j], matrix[j][i]
            }
        }

        printMatrix(matrix);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of matrix");

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        int totalElements = row * column;

        System.out.println("Enter " + totalElements +  " values");

        for(int i =0; i< row; i++){
            for(int j =0; j <column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix: ");
        printMatrix(matrix);

        // System.out.println("Transpose of matrix");

        // int[][] result =  findMatrix(matrix, row, column);
        // printMatrix(result);

        System.out.println("Transpose of matrix using InPlace method");
        transposeInPlace(matrix, row, column);
        
    }
    
}
