//import java.util.* ;

import java.util.Arrays;

public class secondlargestsmall {
    public static int[] func(int[] arr) {
        int lar = Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int n = arr.length ; 
        
        int[] a = new int[2];
          
        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];
            } else if (arr[i] > slar && arr[i] != lar) {
                slar = arr[i];
            }

        }
        a[0] = slar;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin && arr[i] != min) {
                smin = arr[i];
            }

        }
       a[1]= smin;
        return a ; 
    }

    public static void main(String[] args) {
        int[] arrayname = { -10, -20,- 8, -9, -19 };
        int[] result=func(arrayname) ;
        System.out.println( " " + Arrays.toString(result) );
    }
}
