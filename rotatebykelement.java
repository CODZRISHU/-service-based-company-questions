package string;
public class rotatebykelement {
  static char[] func(String num,int k) {
      char temp[] = new char[k];
      int n = num.length();
      char[] arr = num.toCharArray();
      // int i =0;
      k = k % n;
      if (k <= n) {
          for (int i = 0; i < k; i++) {
              temp[i] = arr[n - k + i];
               
          }
          for (int i = n - k - 1; i >= 0; i--) {
              arr[i + k] = arr[i];
          }
          for (int i = 0; i < k; i++) {
              arr[i] = temp[i];
          }
         /*  for (int i = 0; i < n; i++) {
              System.out.print(arr);
          }*/
      } else {
          System.out.print("arraysize less ");
      }
        
          return arr;
  }

  public static void main(String[] args) {
      String arrayname ="rishu";
      int k = 4;
      System.out.print((func(arrayname,k)));
  }
}