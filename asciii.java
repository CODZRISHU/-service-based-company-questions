package string;


//import java.util.* ;
public class asciii {
public static void func(String  num) {
    
    for(int i =0;i<num.length();i++){
        int ch = num.charAt(i);
        System.out.print(ch +" ");
         
    }


}
    public static void main(String[] args) {
        String number = "rishA";
        func(number);
    }
}
