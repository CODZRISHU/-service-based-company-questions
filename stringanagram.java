package string;


//import java.util.* ;
public class stringanagram {
public static boolean func(String  num,String no) {

  int alpha[] = new int[26];
  if(num.length()!=no.length()){
     return false;
  }
      
  for(int i =0;i<num.length();i++){
    char ch = num.charAt(i);
        alpha[ch -'a']++;
  }
  for(int i =0;i<num.length();i++){
    char ch = num.charAt(i);
        alpha[ch -'a']--;
  }
  for(int i =0;i<alpha.length;i++){
       if(alpha[i]<0){
        return false;
       }
  }

      
return true ;
}
    public static void main(String[] args) {
    String number ="rishuk" ;
    String numb = "shriui";
      
    if(func(number, numb)){
        System.out.println("string is anagram");
    }else{
        System.out.println("string is not anagram");
    }
      


       
}
}