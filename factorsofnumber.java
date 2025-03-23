
package numbersystem;
//import java.util.* ;
public class factorsofnumber {
public static void func(int  num) {
   
   for(int i=1;i<=num/2;i++){
      if(num%i == 0){
         System.out.println( i + " ");
      }
   }
}
    public static void main(String[] args) {
        int number = 18;
        func(number);
    }
}