package string;



//import java.util.* ;
public class removeduplicatefromstr {
public static String func(String num) {
    boolean [] alpha = new boolean[26];
        String sum = "";
  for(int i =0;i<num.length();i++){
    char ch = num.charAt(i);
    if(alpha[ch-'a']== false){
       sum += ch;
       alpha[ch -'a'] =true;
    }
       
  }

return sum;
}
    public static void main(String[] args) {
        String number = "rrrrrrrrrrrrtiituu";
        System.out.println(func(number));
    }
}
