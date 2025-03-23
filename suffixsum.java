
//import java.util.* ;
public class suffixsum {
public static int func(int [] num) {
  int n = num.length;
  int suffix = num[n-1];
  int maxi=Integer.MIN_VALUE;
  for(int i =n-2;i>=0;i--){
    
      maxi = Math.max(maxi, suffix-num[i]);
      suffix = Math.max(suffix, num[i]);
  }

return maxi ;
}
    public static void main(String[] args) {
        int []number = {9,5,8,7,8,12,7,4};
        System.out.println(func(number));
    }
}
