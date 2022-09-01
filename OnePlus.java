import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int[] nums={9,9,9};
        System.out.println(Arrays.toString(oneplus(nums)));
    }
    static int[] oneplus(int[] arr){
        int carry=1;
        for(int i=arr.length-1;i>=0 && carry==1;i--){
            int temp=arr[i]+carry;
            if(temp>=10){
                carry=1;
                arr[i]=temp%10;
            }else{
                carry=0;
                arr[i]=temp;
            }
        }
        if(carry!=0){
            int[] nums = new int[arr.length+1];
            nums[0]=1;
            for (int i = 1; i < nums.length; i++) {
                nums[i]=arr[i-1];
            }
            return nums;
        }else{
            return arr;
        }
    }
}
