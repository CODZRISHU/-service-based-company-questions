package numbersystem;
//import java.util.* ;
public class reversenumber {
public static int func(int  num) {
      int rem;
      int n =0;
    while(num !=0){
        rem = num%10;
        n = n*10+rem;
        num /=10;
    }

return n ;
}
    public static void main(String[] args) {
        int number =10909809 ;
        System.out.println(func(number));
    }
}