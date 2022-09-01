import java.util.HashMap;

public class Anagram{
    public static void main(String[] args) {
        String s="anagracm";
        String t="graaamdn";
        System.out.println(isAanagram1(s, t));
        
    }
    static boolean isAanagram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hs= new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
            }
            else{
                hs.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(ht.containsKey(t.charAt(i))){
                ht.put(t.charAt(i), ht.get(t.charAt(i))+1);
            }else{
                ht.put(t.charAt(i), 1);
            }
        }
        for(Character ch:hs.keySet()){
            if(!hs.get(ch).equals(ht.get(ch))) return false;
        }
        return true;
        

    }

    static boolean isAanagram1(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for (int i : counter) {
            if(i!=0) return false;
        }
        return true;

    }

    static boolean isAanagram2(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] table = new int[26];
        for(int i=0;i<s.length();i++){
            table[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            table[t.charAt(i)-'a']--;
            if(table[t.charAt(i)-'a']<0) return false;
        }
        return true;
    }

}