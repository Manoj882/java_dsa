import java.util.*;

public class FindUniqueNumber {

    static List<Integer> findUniqueNumber(int[] nums){

        List<Integer> ans = new ArrayList<>();

        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            set.add(num);
        }

        System.out.println("the value of set: " + set);

        for(int num : nums){
            if(!set.contains(num + 1) && (!set.contains(num - 1))){
                ans.add(num);
            }
        }

        System.out.println("the value of ans: "+ ans);


        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 10, 12, 13, 14,4,5};

        List<Integer> result = findUniqueNumber(arr);

        System.out.println(result);


        
    }
    
}
