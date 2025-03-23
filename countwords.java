package string;


//import java.util.* ;
public class countwords {
public static int func(String  num) {
    num = num.trim();
   int count=0;
   for(int i =0;i<num.length();i++){
    if(num.charAt(i)==' '){
        count++;
    }
   }

return count+1 ;
}
    public static void main(String[] args) {
        String number =" m lkm  m  " ;
        System.out.println(func(number));
    }
}