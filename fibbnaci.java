package numbersystem;
//import java.util.* ;
public class fibbnaci {
public static void func(int  num) {

 int f =0;
 int s =1;


         
            System.out.println(f); 
           
         
        
            System.out.println(s); 
           


           for(int i =2;i<num;i++){
            int fib = f+s;
             System.out.println(fib );
             f =s;
             s =fib;
           }
          

}
    public static void main(String[] args) {
        int number = 10;
      
        func(number);
    }
}
