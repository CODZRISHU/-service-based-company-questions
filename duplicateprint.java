
package string;



//import java.util.* ;
public class duplicateprint {
public static void func(String num) {
    int [] alpha = new int[26];
    
  for(int i =0;i<num.length();i++){
    char  ch = num.charAt(i);

        alpha[ch-'a']++;
      // alpha[ch -'a'] =true;
  } 

  for(int i =0;i<alpha.length;i++){
      if(alpha[i] >1){
        
         int asccii =  'a'+i;
         char c = (char) asccii;
        System.out.print(" "+ c );
       }
       
      }


}
    public static void main(String[] args) {
        String number = "rrrt";
        func(number);
    }
}

