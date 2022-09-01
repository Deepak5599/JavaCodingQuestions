public class JumGame {
    public static void main(String[] args) {
        int[] arr = {0,0,6,1,3};
       // System.out.println(naive(arr));
        System.out.println(jumpgame(arr));
    }

    static boolean naive(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean f = false;
            for (int j = i - 1; j >= 0; j--) {
                if (i - j <= arr[j]) {
                    f = true;
                }
            }
            if (f == false)
                return false;
        }
        return true;
    }
    static boolean jumpgame(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=Math.max(arr[i]+i, res);
            if(res>=arr.length-1)
            return true;
        }
        return false;
    }
}
