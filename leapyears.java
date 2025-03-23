package numbersystem;
//import java.util.* ;
public class leapyears {
public static void func(int  num) {

if((num %4 ==0 && num%100 != 0) || num% 400 ==0){
   System.out.println("leap year");
}
else{
    System.out.println(" not leap year");
}


}
    public static void main(String[] args) {
        int number = 200;
        func(number);
    }
}
