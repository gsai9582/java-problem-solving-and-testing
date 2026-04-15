import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(words[i])) return false;
            } else {
                if(used.contains(words[i])) return false;
                map.put(c, words[i]);
                used.add(words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}