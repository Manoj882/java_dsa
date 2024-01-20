
import java.util.*;

public class CheckTargetSum {

    public static int[] checkTargetSumIndices(int[]arr, int target){

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] result = {-1, -1};


        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int complement = target - num;

            if(map.containsKey(complement)){
                result = new int[] {map.get(complement), i};
            } else {
                map.put(num, i);
            }

        }


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,10,3,9};

        int target = 8;

        int[] result = checkTargetSumIndices(arr, target);

        System.out.println(Arrays.toString(result));


    }
    
}


