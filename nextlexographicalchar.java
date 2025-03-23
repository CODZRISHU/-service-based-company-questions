package string;

//import java.util.* ;
public class nextlexographicalchar {
    public static String func(String num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == 'a') {
                sb.append('z');
            } else if (num.charAt(i) == 'z') {
                sb.append('a');
            } else if (num.charAt(i) == 'A') {
                sb.append('Z');
            } else if (num.charAt(i) == 'Z') {
                sb.append('A');
            } else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z' || num.charAt(i) >= 'A' && num.charAt(i) <= 'Z') {
                int cd = num.charAt(i) + 1;
                char cv = (char) cd;
                sb.append(cv);
            } else {
                sb.append(num.charAt(i));
            }
        }
        String str = sb.toString();
        return str;
    }

    public static void main(String[] args) {
        String number = "aAbc123klomNSD";
        System.out.println(func(number));
    }
}
