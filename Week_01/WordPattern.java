package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        String pattern="abba";
        String str= "dog cat cat dog";
        System.out.println(wordPattern(pattern,str));
    }
    public static boolean wordPattern(String pattern, String str) {
        String [] strings=str.split(" ");
        char [] pstring=pattern.toCharArray();
        if (pattern.length() != strings.length) {
            return false;
        }
        Map<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<strings.length;i++){
            if(!map.isEmpty()&&map.containsKey(pstring[i])){
                if(!map.get(pstring[i]).equals(strings[i])){
                    return  false;
                }
            }else {
                if(map.containsValue(strings[i])){
                    return false;
                }
                map.put(pstring[i], strings[i]);
            }

        }
        return  true;
    }
}
