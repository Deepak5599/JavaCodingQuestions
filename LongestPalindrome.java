public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(longestPalindrome(str));
    }

    static String longestPalindrome(String str) {
        if (str == null || str.length() < 1)
            return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expand(str, i, i);
            int len2 = expand(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, str.length());
    }

    static int expand(String s, int left, int right) {
        int l = left;
        int r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - (l) - 1;
    }
}