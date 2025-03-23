package numbersystem;

//import java.util.* ;
public class armstrongnumber {
    public static void func(int num) {
        int rem;
        int c = 0;
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            c++;
            temp /= 10;
        }
        rem = 0;
        int sum = 0;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, c));
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println(" not armstrong");
        }

    }

    public static void main(String[] args) {
        int number = 10;
        func(number);
    }
}