/*
    Question:
    Given an array 'a' consisting of integers. Return the last value that
    is repeating in this array. If no value is being repeated, return -1;

    input: [1, 5, 3, 4, 6, 3, 4]
    
    output: 4;
 */

public class LastRepeatNumber {

    static int lastRepeatNumber(int[] arr){
        int lastRepeatingNumber = -1;
        
        for(int i =0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    lastRepeatingNumber = arr[i];
                }

            }
        }



        return lastRepeatingNumber;
    }
    

    public static void main(String[] args) {

        int[] input1 = {1, 5, 3, 4, 6, 3, 4,6};

        int[] input2 = {1, 2, 4, 6, 7};

        int output1 = lastRepeatNumber(input1);

        int output2 = lastRepeatNumber(input2);

        System.out.println("Output of input1: "+ output1);

        System.out.println("OUtput of input2: "+output2);
        

    
}






    
    }
