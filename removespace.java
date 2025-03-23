package string;


//import java.util.* ;
public class removespace {
public static String func(String  num) {
   
    StringBuilder sb = new StringBuilder();
    for(int i =0;i<num.length();i++){
        char ch = num.charAt(i);
        if(ch== ' '){

            sb.append("");
             }
        else{
            sb.append(ch);
             }
    }
   String nspac = sb.toString();
return nspac ;
}
    public static void main(String[] args) {
        String number = "  e r i irt   sh ";
       
       System.out.println(func(number));
    }
}