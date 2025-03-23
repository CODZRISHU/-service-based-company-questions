package string;

//import java.util.* ;
public class removevowel {
public static String func(String  num) {

    StringBuilder sb = new StringBuilder();
    for(int i =0;i<num.length();i++){
        char ch = num.charAt(i);
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ){

            sb.append("");
             }
        else{
            sb.append(ch);
             }
    }
   String nvow = sb.toString();
return nvow ;
}
    public static void main(String[] args) {
        String number = "s0defawee   ser";
        System.out.println(func(number));
    }
}