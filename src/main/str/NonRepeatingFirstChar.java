package main.str;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingFirstChar {
    public static void main(String[] args){

        String s = "MorMninog";
        System.out.println("First non-repeating char is:"+findNonrepeatingChar(s));
    }

    private static char findNonrepeatingChar(String s) {
        Map<Character,Integer> chars = new LinkedHashMap<>();
        char result = 0;
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(chars.containsKey(c)){
                chars.put(c,chars.get(c)+1);
            }else{
                chars.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> sets: chars.entrySet()){
            if(sets.getValue()==1){
                return  sets.getKey().charValue();
            }
        }

        return result;
    }

}
