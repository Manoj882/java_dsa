

/*
    Count the number of triplets whose sum is equal
    to the given value x.
    
    input: [1, 4, 4, 6, 3]

    int target(x) = 12;

    output: 3 [(1,5,6), (4,5,3)]

 */


public class TripletSum {

    static int totalNumberOfTripletSum(int[] arr, int target){
        int counts = 0;

        for(int i =0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){

                    if(target == arr[i] + arr[j] + arr[k]){
                        counts++;
                    }
                }
            }
        }

        return counts;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,5,6,3};

        int target = 12;

        int output = totalNumberOfTripletSum(arr, target);

        System.out.println(output);
        
    }
    
}
