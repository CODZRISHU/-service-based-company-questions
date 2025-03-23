package string;

//import java.util.* ;
public class panagramornot {
    public static boolean func(String num) {
        

        boolean[] alpha = new boolean[26];
        num=num.trim();
        num = num.replaceAll("\\s", "");

        num = num.toLowerCase();
        
        for (int i = 0; i <= num.length()-1; i++) {
            char ch = num.charAt(i) ;
            if(ch >='a'&& ch<='z'){
               int c=  ch - 'a';
              alpha[c] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!alpha[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String number = "abc defghi jkl mnop qrst uvw xyz ";
        if (func(number)) {
            System.out.println("string is pangram");
        } else {
            System.out.println("string is  not  pangram");
        }
    }
}
