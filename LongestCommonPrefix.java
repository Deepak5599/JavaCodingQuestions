public class LongestCommonPrefix{
    public static void main(String[] args){
        String[] str = new String[3];
        str[0]="leetcode";
        str[1]="leader";
        str[2]="loder";
        System.out.println(longestCommonPreix(str));
       // System.out.println("Hwllo");
    }
    static String longestCommonPreix(String[] str){
        if(str==null) return "";
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}