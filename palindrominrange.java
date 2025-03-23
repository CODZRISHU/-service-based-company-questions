package numbersystem;

//import java.util.* ;
public class palindrominrange {
    public static void func(int start, int till) {

        for (int i = start; i <= till; i++) {
            int temp = i;
            int rem = 0;
            int nums = 0;
            while (temp != 0) {
                rem = temp % 10;
                nums = nums * 10 + rem;
                temp /= 10;
            }
            if (nums == i) {
                System.out.println(" " + i + " -> " + "palindrom");
            }

        }

        // return 0 ;
    }

    public static void main(String[] args) {

        int from = 11;
        int to = 11;
        func(from, to);
    }
}