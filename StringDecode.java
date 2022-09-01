import java.util.*;

public class StringDecode {
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        System.out.println(stringDecode(str));
    }

    static String stringDecode(String str) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                while (i + 1 < len && Character.isDigit(str.charAt(i+1))) {
                    num = num * 10 + str.charAt(i+1) - '0';
                    i++;
                }
                numStack.push(num);
            } else if (c == '[') {
                strStack.push(sb.toString());
                sb = new StringBuilder();
            } else if (c == ']') {
                int repeats = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j = 0; j < repeats; j++) {
                    temp.append(sb);
                }
                sb = temp;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
