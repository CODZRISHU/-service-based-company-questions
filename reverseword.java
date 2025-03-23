package string;



public class reverseword{
  public static String func(String num) {
    String[] nums = num.split("\\s");
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {

      String temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;

      i++;
      j--;

    }
    String result = String.join(" ", nums);
    return result;
  }

  public static void main(String[] args) {
    String number = "  reish hi hi ko ki whus ";
    System.out.println((func(number)));
  }
}

