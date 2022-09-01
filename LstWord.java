public class LstWord {
    public static void main(String[] args) {

        String str = "Hello  World  ";

        System.out.println(lastWord(str));

        System.out.println(lenoflastword(str));

    }
    static int lastWord(String str){
        str=str.trim();
        int i=0;
        int n=str.length()-1;
        while(str.charAt(n)!=' '){
            i++;
            n--;
        }
        return i;
    }
    static int lenoflastword(String str){
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                if(count > 0) return count;
            }
        }
        return count;
    }
}
