package string;

public class palindromstring {
    public static boolean func(String num) {

        char[] ch = num.toCharArray();

        int i = 0;
        int j = ch.length - 1;
        while (i < ch.length / 2) {

            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

    public static void main(String[] args) {
        String number = "121 121";

        if (func(number)) {
            System.out.println("string is palindrom");
        } else {
            System.out.println("string is  not  palindrom");
        }
    }
}