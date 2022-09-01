
public class ReverseWordString{
    public static void main(String[] args) {
        String str = "The sky is blue";
        System.out.println(reverseWord(str));
    }
    static String reverseWord(String str){
        StringBuilder sb = new StringBuilder();
        int i=str.length()-1;
        while(i>=0){
            if(str.charAt(i)==' '){
                i--;
            }else{
               int j=i;
                while(i>= 0 && str.charAt(i)!=' '){
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for(int k=i+1;k<=j;k++){
                    sb.append(str.charAt(k));
                }
            }
        }
        return sb.toString();
    }
}