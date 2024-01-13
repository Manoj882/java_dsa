
/*
 Question:
 
 Create a HashMap using Java HashMap class to store the following pairs(Person, Age)
 and display them.

 Input:
 Akash 21
 Yash 16
 Lav 17
 Rishika 19
 Harry 18

 Output:
 Age of Akash is 21
 Age of Yash is 16
 Age of Lava is 17
 Age of Rishika is 19
 Age of Harry is 18

 */

import java.util.*;

public class HashMapMethods {

   public static void main(String[] args) {

    // Syntax

    Map<String, Integer> map = new HashMap<>();

    // Adding Elements

    map.put("Akash", 21);
    map.put("Yash",16);
    map.put("Lav", 17);
    map.put("Rishika", 19);
    map.put("Harry", 81);
   


    // Getting value of key from the Hash Map

   System.out.println(map.get("Akash"));
   System.out.println(map.get("anuj"));

   System.out.println(map.get("Harry"));

    // Changing value of a key in the HashMap

    map.put("Harry", 18);

    System.out.println(map.get("Harry"));

    // Removing a pair from the HashMap

    System.out.println("Remove key from HashMap");

    System.out.println("Remove akash: " +  map.remove("Akash"));
    System.out.println("Remove Kiran which is not exist in keys: " + map.remove("kiran"));

    // Checking if a key is in the HashMap
    System.out.println();
    System.out.println("**** Checking if a key is in the HashMap ****");
    

    System.out.println(map.containsKey("Akash"));
    System.out.println(map.containsKey("Yash"));


    // Adding a new entry only if the new key doesn't exist already

    System.out.println("*** Adding a new entry only if the new key doesn't exist already");

    // Method 1:
   // if(!map.containsKey("Lav")) map.put("kiran", 36);

   // Method 2:
   System.out.println(map.putIfAbsent("Kiran", 24));
    

    // Get all keys in the HashMap

    System.out.println("*** get all keys ****");

    System.out.println(map.keySet());

    // Get all values in the HashMap

    System.out.println("*** get all values");
    System.out.println(map.values());


    // Get all entries in the HashMap
    System.out.println("*** get all entries ***");
    System.out.println(map.entrySet());

    System.out.println();
    // Traversing all entries of HashMap - multiple methods
    System.out.println("*** traverse all entries ***");

    // for(String key : map.keySet()){
    //     System.out.printf("Age of %s is %d\n", key, map.get(key));
    // }

    for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());

    }
    

   }
}