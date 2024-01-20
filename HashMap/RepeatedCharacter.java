
import java.util.*;

public class RepeatedCharacter {


    static char repeatedChar(String str){

       // Map<Character, Integer> map = new HashMap<Character, Integer>();

       Set<Character> set = new HashSet<Character>();

        for(int i =0; i < str.length(); i++){

            char c = str.charAt(i);
            // for(int j = i +1; j < str.length(); j++){
            //     if(str.charAt(j) == c){
            //         return c;
            //     }
            // }

            if(set.contains(c)){
                return c;
            } else {
                set.add(c);
            }

            System.out.println("Set value: " + set);
            
        }

        return ' ';
    }


    public static void main(String[] args) {

        String text = "bcdabcd";

        char result = repeatedChar(text);

        System.out.println(result);

        
    }
    
}
