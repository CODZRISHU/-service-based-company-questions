import java.util.*;

public class rankusingmap {
    public static void func(int[] arr) {
        int temp = 1;
        int n = arr.length;
        int brr[] = new int[n];

        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }

        HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();

        Arrays.sort(brr);
        for (int i = 0; i < n; i++) {
            if (mp.get(brr[i]) == null) {
                mp.put(brr[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }

    }

    public static void main(String[] args) {
        int[] arrayname = { 10, 20, 0, 4, 2, 5, 8, 9, 19 };
        func(arrayname);
    }
}