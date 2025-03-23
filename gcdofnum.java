package numbersystem;
//import java.util.* ;
public class gcdofnum {
public static int func(int a,int b) {
  
  while(a!=0&&b!=0){
    if(a>b){
        a=a%b;
    }else{
        b=b%a;
    } 
  } 
  if(a==0){
    return b;
  }

 return a;
}
    public static void main(String[] args) {
        int number = 50;
        int no =25;
        System.out.println(func(number,no));
    }
}