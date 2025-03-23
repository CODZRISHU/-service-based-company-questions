package numbersystem;

//import java.util.* ;
public class ClassName {
    public static boolean func(int num) {
    
        int sum = 0;
        int t = num;
        
        while (t > 0) {
            int rem = t % 10;
            sum += rem;
            System.out.println(sum);
            t /= t;
        }
        

        if (num % sum == 0) {
            return true;
        }else{
        return false;}
         }

    public static void main(String[] args) {
        int number = 121;
        
        if (func(number)) {
            System.out.println(" harshad no");
        } else {
            System.out.println("not harsad no");
        }
    }
}
