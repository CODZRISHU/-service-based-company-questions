//import java.util.*;



public class smallelement {
    public static int func(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arrayname = { 10, 20, -20000, 5, 8, 9, 19 };
         func(arrayname);
        
        
        System.out.println( func(arrayname));
        
        
       
        
    }
}