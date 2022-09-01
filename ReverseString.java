public class ReverseString{
    public static void main(String[] args){
        String str="Hello";
        // char[] ch = new char[5];
        // for (int i = 0; i < ch.length; i++) {
        //     ch[i]=str.charAt(i);
        // }
        // System.out.println(ch.toString().toString());
        System.out.println(powfunc1(str));
    }
    static String powfunc1(String s){
        char[] str = new char[s.length()];
        int i=0;
        int len=s.length()-1;
        while(i<s.length()){
            str[i]=s.charAt(len);
            i++;len--;
        }
        return String.valueOf(str);
    }
}