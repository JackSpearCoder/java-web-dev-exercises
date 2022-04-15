package Chapter3Studio;

import java.util.HashMap;
import java.util.Map;

public class Countingcharacters {
     public static void main (String [] args){
         String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. so if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

         char[] charactersInString = str.toCharArray();

         HashMap<Character, Integer> strhash = new HashMap<>();

         for (Character letters : charactersInString){

             if (strhash.containsKey(letters)) {
                    strhash.put(letters, strhash.get(letters) + 1);
             } else {
                 strhash.put(letters,1);
             }
         }
         for (Map.Entry<Character, Integer> letter : strhash.entrySet()) {
             System.out.println(letter.getKey() + ":" + letter.getValue());
         }
     }
}

