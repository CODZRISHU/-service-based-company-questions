package numbersystem;

//import java.util.* ;
public class strongnumber {

  static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }

    return fact;
  }

  public static boolean func(int num) {

    int temp = num;
    int sum = 0;
    while (num != 0) {
      int rev = num % 10;
      int f = fact(rev);
      sum += f;
      num /= 10;
    }

    if (sum == temp) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    int number = 145;
    if (func(number))
      System.out.println("strong number");
    else {
      System.out.println(" not strong number");
    }
  }
}
