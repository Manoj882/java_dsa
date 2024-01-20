
/*
 Question 1:

 Given an array, find the most frequent element in it,
 If there are multiple elements that appear a maximum
 number of times. print any of them.

 Input:
 arr[] = {1,4,2,5,1,4,4,6,4,4,4,6,2,2}

 Expected Output: 4
 
 */

import java.util.*;

public class MaxFrequency {

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4,6,2,2};

        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        for(int element : arr){
            if(!freqMap.containsKey(element)){
                freqMap.put(element, 1);
            } else {
                freqMap.put(element, (freqMap.get(element) + 1));
            }
        }


        System.out.println("*** Frequency Map ***");
        System.out.println(freqMap.entrySet());

        int maxFreq = 0, anskey = -1;

        // traverse map : Method 1

        // for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
        //     if(entry.getValue() > maxFreq){
        //         maxFreq = entry.getValue();
        //         anskey = entry.getKey();
        //     }
        // }


        // traverse map : Method 2

        for(int key : freqMap.keySet()){
            if(freqMap.get(key) > maxFreq){
                maxFreq = freqMap.get(key);
                anskey = key;
            }
        }

        System.out.printf("%d has maximum frequency and it occurs %d times.", anskey, maxFreq);

        

        
    }
    
}
