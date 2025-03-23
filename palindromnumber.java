
package numbersystem;

//import java.util.* ;
public class palindromnumber {
    public static boolean func(int num) {
        int temp =num;
        int rem;
        int nums = 0;

        while (num != 0) {
            rem = num % 10;
            nums = nums * 10 + rem;
            num /= 10;
        }
        if(nums ==temp){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        int number = 0;
       
         if (func(number)  == true){
          System.out.println("palindrom");
         }else{
          System.out.println("not palindrom");
         }
    }
}