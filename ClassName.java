package string;


//import java.util.* ;
public class ClassName {
public static String func(String  num,String no) {
        StringBuilder sb=new StringBuilder();
        for(int i =0;i<num.length();i++){
            sb.append(num.charAt(i));
        }
        for(int i =0;i<no.length();i++){
            sb.append(no.charAt(i));
        }

        String n = sb.toString();
return n ;
}
    public static void main(String[] args) {
        String number ="fgt" ;
        String no = "cbc";
        System.out.println(func(number,no));
    }
}