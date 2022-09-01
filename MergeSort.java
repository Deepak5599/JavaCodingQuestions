import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] n={1,2,3,0,0,0};
        int[] m={2,5,6};
        //System.out.println(Arrays.toString(mergeSortArray1(n, m)));
        System.out.println(Arrays.toString(mergeSortArray1(n, m, 3, 3)));
    }
    static int[] mergeSortArray(int[] n,int[] m){
       for(int i=m.length,j=0;i<n.length;i++){
        n[i]=m[j];
        j++;
       }
       Arrays.sort(n);
    return n;
    }
    static int[] mergeSortArray1(int[] n,int[] m,int a,int b){
        a--;
        b--;
        for(int i=a+b+1;i>=0;i--){
            int e1 = a >= 0 ? n[a]:Integer.MIN_VALUE;
            int e2 = b >= 0 ? m[b]:Integer.MIN_VALUE;

            if(e1>=e2){
                n[i]=e1;
                a--;
            }else{
                n[i]=e2;
                b--;
            }
        }
        return n;

    }

}
