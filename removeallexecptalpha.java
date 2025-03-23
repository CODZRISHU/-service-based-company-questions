package string;

//import java.util.* ;
public class removeallexecptalpha {
public static StringBuilder func(String  num) {
     StringBuilder sb = new StringBuilder();

     for(int i =0;i<num.length();i++){
       char ch = num.charAt(i);
        if(ch >= 'a'&& ch <='z'||ch >= 'A'&& ch <='Z'){
            sb.append(ch);
        }else{
            sb.append("");
        }
     }

return sb ;
}
    public static void main(String[] args) {
        String number = "rei!@m%i4)(ms0*@#$";
        System.out.println(func(number));
    }
}
