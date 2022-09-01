import java.util.Arrays;

public class ExtraCandies{
    public static void main(String[] args) {
        int[] n = {2,3,5,1,3};
        int extra = 3;
        System.out.println(Arrays.toString(extraCandies(n, extra)));
    }
    static boolean[] extraCandies(int[] n,int extra){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            max=Math.max(n[i],max);
        }
        boolean[] bl=new boolean[n.length];
        for(int i=0;i<n.length;i++){
            if(max<=n[i]+extra){
                bl[i]=true;
            }else{
                bl[i]=false;
            }
        }
        return bl;
    }
}