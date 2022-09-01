import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {-3,-3,4,-3};
        System.out.println(Arrays.toString(asteroidcollision(arr)));
    }
    static int[] asteroidcollision(int[] arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()<Math.abs(arr[i])){
                    stack.pop();
                }if(stack.peek()<0 ||  stack.isEmpty() ){
                    stack.push(arr[i]);
                }else if(Math.abs(stack.peek())==arr[i]){
                    stack.pop();
                }
            }
            list.add(stack.get(i));
        }
       return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}
