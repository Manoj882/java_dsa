import java.util.*;

public class CheckIfPanagram {

    public static boolean checkIfPanagram(String str){

        Set<Character> set = new HashSet<Character>();

        for(int i =0; i < str.length(); i++){
            char c = str.toLowerCase().charAt(i);

            if(c >= 'a' && c <='z'){
                set.add(c);
            }
        }


        return set.size() == 26;
    }



    public static void main(String[] args) {

        String input = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPanagram(input);

        System.out.println(result);
        
    }
    
}
