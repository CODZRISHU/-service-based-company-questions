package string;


//import java.util.* ;
public class sumofstring {
public static int func(String num) {
     int sum =0;

     for(int i =0;i<num.length();i++){
        char ch = num.charAt(i);
         int cha = ch -'0';  
           sum +=cha;  
     }

return sum ;
}
    public static void main(String[] args) {
        String number ="1234245" ;
        System.out.println(func(number));
    }
}