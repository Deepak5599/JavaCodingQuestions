public class AverageSalary {
    public static void main(String[] args) {
        int[] num = {4000,3000,2000,1000};
        System.out.println(averageSalary(num));
    }
    static int averageSalary(int[] num){
        int min=num[0];
        int max=num[0];
        for(int i=0;i<num.length;i++){
            min=Math.min(num[i], min);
            max=Math.max(num[i],max);
        }
        int sum=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=max && num[i] !=min)
            sum+=num[i];
        }
        return sum/(num.length-2);
    }
}
