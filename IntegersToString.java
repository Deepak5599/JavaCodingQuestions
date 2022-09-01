public class IntegersToString{
public static void main(String[] args) {
    int n = 1234534;
    String s = "";
    int i=0;
    while(n>0){
        if(n%1000 !=0)
            s = helper(n%1000)+" "+THOUSANDS[i]+" "+s;
        n=n/1000;
        i++;
    }
    System.out.println(s);
}

static String helper(int n){
if(n==0) return "";
if(n<20) {
return LESS_THAN_20[n]+" ";
}else if(n<100){
return TENS[n/10] + " "+ helper(n%10);
}else{
return LESS_THAN_20[n/100]+" Hundered "+helper(n%100);
}
}



private static  final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
private static  final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
}