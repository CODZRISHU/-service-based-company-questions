package numbersystem;

//import java.util.* ;
public class perfectnumber {
    public static void func(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("perfect num");
        } else {
            System.out.println(" not perfect num");
        }

    }

    public static void main(String[] args) {
        int number = 28;
        func(number);
    }
}
