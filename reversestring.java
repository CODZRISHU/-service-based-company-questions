package string;

//import java.util.*;

public class reversestring {
  public static String func(String num) {
    char[] nums = num.toCharArray();
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {

      char temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;

      i++;
      j--;

    }

    return new String(nums);
  }

  public static void main(String[] args) {
    String number = "reish";
    System.out.println((func(number)));
  }
}
