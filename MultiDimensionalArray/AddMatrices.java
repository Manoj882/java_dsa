import java.util.Scanner;

public class AddMatrices {

    static void printMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){

        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible.");
            return;
        }

        int[][] sumMatrix = new int[r1][c1];

        for(int i =0; i < r1; i++){

            for(int j =0; j < c1; j++){
                sumMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of matrix 1 and matrix 2");

        printMatrix(sumMatrix);


    }

    public static void main(String[] args) {
        // int[][] arr1 = {{2,3}, {4,5}};
        // int[][] arr2 = {{1,2}, {3,4}};

        // addMatrix(arr1, 2, 2, arr2, 2, 2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of matrix 1: ");

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter matrix values: ");

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of matrix 2: ");

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter matrix values: ");

        for(int i =0; i < r2; i++){
            for(int j =0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        addMatrix(arr1, r1, c1, arr2, r2, c2);
    }
    
}
