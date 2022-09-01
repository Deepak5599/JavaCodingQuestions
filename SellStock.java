public class SellStock {
    public static void main(String[] args) {
        int[] stock = {7,6,5,4,3,2,1};
        System.out.println(stockProfit1(stock));
    }
    static int stockProfit(int[] num){
        int profit = 0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                profit=Math.max(profit,num[j]-num[i]);            
            }
        }
        return profit;
    } // O(n)*O(n)
    static int stockProfit1(int[] num){
        int profit = 0;
        int buyAt=num[0];
        for(int i=1;i<num.length;i++){
            profit = Math.max(num[i]-buyAt,profit);
            if(num[i]<buyAt){
                buyAt=num[i];
            }
        }
        return profit;
    }
}
