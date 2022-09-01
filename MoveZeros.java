import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes1(nums)));
    }   
    static int[] moveZeroes(int[] arr){
        int zero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0);
            zero++;
        }
        int n=0;
        for (int i = 0,j=0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            n=j;
        }
        for (int i = n; i < arr.length; i++) {
            arr[i]=0;
        }
        return arr;

    }
    static int[] moveZeroes1(int[] arr){
        int count=0;
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
}
