//import java.util.* ;



public class duplicatesorted {

    public static void fun(int [] arr) {
        int k = func(arr);
          for(int i =0;i<k;i++){
                System.out.print(" "+ arr[i]);
          }
    }
public static int func(int [] arr) {
   // ArrayList <Integer> al =new ArrayList<>();

     int j=0;
    int n =arr.length;
    for(int i =1;i<n;i++){
        if(arr[j]!=arr[i]){
            j++;
            arr[j]=arr[i];
        
        }
    }
return j+1;
}
    public static void main(String[] args) {
        int[] arrayname = {1,2,2,3,3,4};
        fun(arrayname);
    }
}
