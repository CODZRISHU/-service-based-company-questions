//import java.util.* ;
public class rotatebykelement {
    static void func(int[] arr, int k) {
        int temp[] = new int[k];
        int n = arr.length;
        // int i =0;
        k = k % n;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                temp[i] = arr[n - k + i];
            }
            for (int i = n - k - 1; i >= 0; i--) {
                arr[i + k] = arr[i];
            }
            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(" " + arr[i]);
            }
        } else {
            System.out.print("arraysize less ");
        }

    }

    public static void main(String[] args) {
        int[] arrayname = { 1, 8, 7 };
        int k = 5;
        func(arrayname, k);
    }
}