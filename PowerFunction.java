public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(powFun(2.1, 3));
    }
    static double powFun(double d,int n){
    double ans=1.0;
    int m=n;
    if(n<0){
        m=n*(-1);
    }
        for(int i=1;i<=m;i++){
            ans*=d;
    }
    if(n<0) return (double)1.0/(double)ans;
    return ans;
    }
    
}
