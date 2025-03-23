package string;
//import java.util.*;
public class encryp{
  public static String func(String str){
    StringBuilder sb = new StringBuilder();
    int n= str.length();
     for(int i=0;i<n;i++){
       int c = str.charAt(i);
       if(c >= 97 && c<=117){
        
          int ch = c+5;
          char cc= (char) ch;
          sb.append(cc);
       }
       else if(c>=118 && c<=122){
        int ch = c-21;
        char cc =(char) ch;
        sb.append(cc);
       }
     }
     String s = sb.toString();
     return s;
  }

  public static void main(String []args){
    String st = "reply";
    System.out.println(func(st));
  }
}