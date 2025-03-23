//import java.util.* ;
public class avgofelement {
public static float func(int [] arr) {
    int sum =0;
    int n = arr.length;
    for(int i =0;i< n;i++){
        sum = sum + arr[i];
    }
    int avg =  sum/n;
return avg ;
}
    public static void main(String[] args) {
        int[] arrayname = {10, 20, 0,4,2,5,8,9,19};
        System.out.println(func(arrayname));
    }
}