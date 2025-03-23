import java.util.* ;
public class medianofele {
public static float func(int [] arr) {
    int n = arr.length;
    float median =0;
    Arrays.sort(arr);
    if(n%2==0){
        median = (float)(arr[n/2]+arr[n/2-1])/2;
    }else{
        median = (float) arr[n/2];
    }
 
return median ;
}
    public static void main(String[] args) {
        int[] arrayname = {2,5,1,7};
        System.out.println(func(arrayname));
    }
}
