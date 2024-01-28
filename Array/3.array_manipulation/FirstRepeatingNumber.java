/*
    Question:
    Given an array 'a' consisting of integers. Return the first value that
    is repeating in this array. If no value is being repeated, return -1;

    input: [1, 5, 3, 4, 6, 3, 4]
    
    output: 3;
 */



class FirstRepeatingNumber {

    static int firstRepeatNumber(int[] arr){
        int firstRepeatElement = - 1;

        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    firstRepeatElement = arr[i];
                    //break;  // Here, break keyword only stop j iteration not i iteration so it gives last repeating number 

                    return firstRepeatElement; // return keyword terminate the function/method in which it is used so there is no further iteration of i and j loop
                }
            }
        }

        return firstRepeatElement;
    }

    public static void main(String[] args) {

        int[] input1 = {1, 5, 3, 4, 6, 3, 4};

        int[] input2 = {1, 2, 4, 6, 7};

        int output1 = firstRepeatNumber(input1);

        int output2 = firstRepeatNumber(input2);

        System.out.println(output1);

        System.out.println(output2);
        

    }
}