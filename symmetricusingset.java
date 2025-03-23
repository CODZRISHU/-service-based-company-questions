import java.util.*;

public class symmetricusingset {
    public static void func(int[][] arr) {
        HashMap<Integer, Integer> has = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int fir = arr[i][0];
            int sec = arr[i][1];

            if (has.get(sec) != null && has.get(sec) == fir) {

                System.out.print("(" + fir + " " + sec + ") ");
            } else {

                has.put(fir, sec);
            }

        }
    }

    public static void main(String[] args) {
        int[][] arrayname = { { 10, 20 }, { 20, 10 }, { -1, 0}, { 0, -1 } };
        func(arrayname);
    }
}
