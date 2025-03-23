package string;

//import java.util.* ;
public class defagingipaddress {
    public static String func(String num) {
        int n = num.length();
        int i = 0;
        String res="";

        while (i < n) {
            char ch = num.charAt(i);
            if (ch == '.') {
                res = res + "[.]";
                
            } else {
                res += ch;
            }
             i++;
        }

        return res;
    }

    public static void main(String[] args) {
        String number = "234.345.56.4";
        System.out.println(func(number));
    }
}