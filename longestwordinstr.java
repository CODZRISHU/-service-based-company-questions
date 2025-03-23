package string;

//import java.util.* ;
public class longestwordinstr {
    public static String func(String num) {
        int totallen = 0;

        String ca = "";
        String c = "";
        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);
            if (ch == ' ') {
                if (c.length() > totallen) {
                    ca = c;
                    totallen = c.length();
                    c = "";
                }
            } else {
                c += ch;
            }
        }
        if (c.length() > totallen) {
            ca = c;
        }

        return ca;
    }

    public static void main(String[] args) {
        String number = "sefe jikokl kilo#45rt5 5tyertyyfgh";
        System.out.println(func(number));
    }
}