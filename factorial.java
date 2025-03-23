package numbersystem;
//import java.util.* ;
public class factorial {
public static int func(int  num) {
    int fact =1;
    for(int i =1;i<=num;i++){
      fact =fact *i;
    }
return fact;
}
    public static void main(String[] args) {
        int number = 19;
        System.out.println(func(number));
    }
}