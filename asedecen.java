import java.util.* ;
public class asedecen {
public static void func(int [] arr) {
     int n = arr.length;
      Arrays.sort(arr);
       int i;
      for(i = 0;i<=n/2;i++){
        System.out.print(arr[i] +" ");
      }
      for(i = n-1;i>n/2;i--){
        System.out.print(arr[i] +" ");
      }

}
    public static void main(String[] args) {
        int[] arrayname = {10, 20, 9,4,8};
        func(arrayname);
    }
}