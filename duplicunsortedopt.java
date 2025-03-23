//import java.security.KeyStore.Entry;
import java.util.* ;
public class duplicunsortedopt {
public static int[] func(int [] arr) {
    HashSet <Integer> set = new HashSet<>();
    int n = arr.length;
    for(int i =0;i<n;i++){
        set.add(arr[i]);
        }
int[] arrr = new int[set.size()];
int in = 0;
 for( int num : set )  {
    arrr[in++] =num;
 }
    
return arrr;
}
    public static void main(String[] args) {
        int[] arrayname = {10, 20, 0,0,0,20,21,20,10,10,10,10};
        
        System.out.println(Arrays.toString(func(arrayname)));
    }
}
