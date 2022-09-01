import java.util.HashMap;

import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args) {
       String str = "{{(})}";
       System.out.println(isValidParenthesis(str));
    }
    static boolean isValidParenthesis(String s){
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
               stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char target=stack.pop();
                if(!map.containsKey(target) || map.get(target)!=c) return false;

            }
        }
        return stack.isEmpty();
    }
}
