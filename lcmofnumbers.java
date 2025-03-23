package numbersystem;


//import java.util.* ;
public class lcmofnumbers {
public static int func(int a,int b) {
    
    while(a!=0&&b!=0){
        if(a>b){
            a = a%b;
        }else{
            b=b%a;
        }
    }
      if(a==0){
        return b;
      }
return a ;
}
public static int lcm(int a,int b) {
 int gcd = func(a, b) ;
  int lcm =0;
   lcm = a*b /gcd;
return lcm;
}



    public static void main(String[] args) {
        int number = 24 ;
        int no = 12;
        System.out.println(lcm(number,no));
    }
}
