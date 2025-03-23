package string;


//import java.util.* ;
public class countvowconsspac {
public static void func(String  num) {

      int vcount =0;
      int ccount =0;
      int scount =0;

     for(int i =0;i<num.length();i++){
        char ch = num.charAt(i);
          if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ){
              vcount++;
          }
          else if(ch >= 'a'&& ch <= 'z'|| ch >= 'A'&& ch <= 'Z'){
            ccount++;
          }
          else if (ch ==' '){
            scount++;
          }
     }

     System.out.println(vcount + " " + ccount + " " + scount);



}
    public static void main(String[] args) {
        String number = "aeishu ";
        func(number);
    }
}