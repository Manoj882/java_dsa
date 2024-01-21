import java.util.*;

// public class CheckIfPanagram {

//     public static boolean checkIfPanagram(String str){

//         Set<Character> set = new HashSet<Character>();

//         for(int i =0; i < str.length(); i++){
//             char c = str.toLowerCase().charAt(i);

//             if(c >= 'a' && c <='z'){
//                 set.add(c);
//             }
//         }


//         return set.size() == 26;
//     }



//     public static void main(String[] args) {

//         String input = "123thequickbrownfoxjumpsoverthelazydog";

//         boolean result = checkIfPanagram(input);

//         System.out.println(result);
        
//     }
    
// }


public class CheckIfPanagram {

    public static boolean checkIfPangram(String sentence){

        Set<Character> set = new HashSet<Character>();
        int length = sentence.length();

        for(int i =0; i < length; i++){
            char c = sentence.toLowerCase().charAt(i);

            if(!set.contains(c) && (c >='a' && (c <='z'))){
                set.add(c);
            }
        }



        return set.size() == 26;
    }

    public static void main(String[] args) {

        String sentence = "123thequickbrownfoxjumpsoverthelazydog";
        boolean output = checkIfPangram(sentence);
        System.out.println(output);
        
    }
}
