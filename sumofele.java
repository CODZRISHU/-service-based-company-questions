//import java.util.* ;
public class sumofele {
public static int func(int [] arr) {
    int n =arr.length;
    int sum =0;
    for(int i=0;i<n;i++){
       sum += arr[i];
    }
return sum ;
}
    public static void main(String[] args) {
        int[] arrayname = {10, 20};
        System.out.println(func(arrayname));
    }
}