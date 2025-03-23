package string;

//import java.util.* ;
public class uppercharbeforespace {
public static StringBuilder func(String  num) {
    if (num == null || num.isEmpty()) {
        return new StringBuilder(num); 
    }
   
    StringBuilder sb = new StringBuilder(num);
  
        for(int i = 0;i<num.length();i++){

            if(i==0||i==num.length()-1){
            sb.setCharAt(i, Character.toUpperCase(num.charAt(i)));
            }
            else if(num.charAt(i)==' '){
              sb.setCharAt(i+1,Character.toUpperCase(num.charAt(i+1)) );
              sb.setCharAt(i-1,Character.toUpperCase(num.charAt(i-1)) );

            }
        }
return sb;
}
    public static void main(String[] args) {
        String number = "   what are  your goals  ";
        System.out.println((func(number)));
    }
}
