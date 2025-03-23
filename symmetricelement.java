//import java.util.* ;
public class symmetricelement {
public static void func(int [][] arr) {
    int n = arr.length;
   for(int i =0;i<n;i++){
    for(int j=i+1;j<n;j++){
   if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0] ){
    System.out.println(" "+ arr[i][1] + " "+ arr[i][0]);
    break;
   }
    }
   }


//return 0 ;
}
    public static void main(String[] args) {
        int[][] arrayname = {{10,20}, {20,10},{10,20},{20,10},{20,10},{11,20}};
       func(arrayname);
    }
}