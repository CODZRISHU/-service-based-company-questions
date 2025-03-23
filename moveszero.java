//package numbersystem;
//import java.util.* ;
public class moveszero {
    public static void func(int[] num) {
        int nz = 0;
        int z = 0;
        int n = num.length;

        while (nz < n) {
            if (num[nz] != 0) {

                int temp = num[nz];
                num[nz] = num[z];
                num[z] = temp;

                nz++;
                z++;

            } else {
                nz++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(  num[i] + " " );
        }

    }

    public static void main(String[] args) {
        int[] number = { 1, 0, 3, 0, 4 };
        func(number);
    }
}