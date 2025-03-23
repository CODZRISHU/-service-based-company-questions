//import java.util.* ;
public class largestelement {
    public static int func(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arrayname = { 10, 2, 0000020, 4, 2, 5, 8, 9, 19 };
        System.out.println((func(arrayname)));
        
    }
}