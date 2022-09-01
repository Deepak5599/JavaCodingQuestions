import java.util.HashMap;
import java.util.Map;

public class LongestSubString{
    public static void main(String[] args) {
        String str="abccdfjgesdabc";
        System.out.println(longestSubString(str));
    }
    static int longestSubString(String str){
        int len=str.length();
        int ans=0;
        Map<Character,Integer> hs = new HashMap<>();
        for(int i=0,j=0;j<len;j++){
                if(hs.containsKey(str.charAt(j))){
                   i = Math.max(hs.get(str.charAt(j)),i); 
                }
                ans = Math.max(ans,j-i+1);
                hs.put(str.charAt(j),j+1);
        }
        return ans;
    }
}