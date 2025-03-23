import java.util.*;

public class rankofelements {
    public static void func(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    set.add(arr[j]);
                }

            }
            int rank = set.size() + 1;
            System.out.print(" " + rank);

        }

    }

    public static void main(String[] args) {
        int[] arrayname = { 1,3,3,2,0,3,4,2 };
        func(arrayname);
    }
}