
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DNASequence{
    public static void main(String[] args) {
        
    }
    static List<String> dnaSq(String s){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String substring = s.substring(i, i+10);
            map.put(substring, map.getOrDefault(substring,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> item: map.entrySet()){
            if(item.getValue()>1) list.add(item.getKey());
        }
        return list;
    }
    static List<String> dnaSq1(String s){
        Set<String> set = new HashSet<>();
        Set<String> list=new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String substring = s.substring(i, i+10);
            if(set.contains(substring)) list.add(substring);
            else set.add(substring);
        }
        return new ArrayList<String>(list);
        
    }
}