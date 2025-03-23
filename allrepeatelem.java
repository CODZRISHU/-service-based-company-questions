//import java.util.* ;
public class allrepeatelem {
public static void func(int [] arr) {
  int n = arr.length;
  int dup[] = new int[n];
  int cnt = 0;
  for(int i =0;i<n-1;i++)
  {
    for(int j =i+1;j<n;j++){
    if(arr[i]!=arr[j]){
      dup[cnt++]= arr[i];
    }
  }}

  for(int j =0;j<cnt;j++){
    if(dup[j]!=dup[j+1]){
     System.out.println( dup[j] + " ");
    }

}
}
    public static void main(String[] args) {
        int[] arrayname = {10, 20,20,20,9,10,9};
        func(arrayname);
    }
}

