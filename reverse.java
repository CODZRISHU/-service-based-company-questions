//import java.util.* ;

import java.util.Arrays;

public class reverse {
    public static int[] func(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrayname = { 10, 20, 0, 4, 2, 5, -8, 9, -19 };
       int[] result= func(arrayname);
          System.out.println(Arrays.toString(result)) ;
    }
}