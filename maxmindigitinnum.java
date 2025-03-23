package numbersystem;
//import java.util.* ;
public class maxmindigitinnum {
public static int func(int  num) {
      int rem =0;
      int max =Integer.MIN_VALUE;
      int temp =num;
      
      while(num !=0){
        rem = num%10;
        if(rem>max){
            max = rem;
            num/=10;
        }else{
            num/=10;
        }

      }



      int min =Integer.MAX_VALUE;
      

      while(temp !=0){
        rem = temp%10;
        if(rem<min){
            min = rem;
            
            temp/=10;
        }else{
            temp/=10;
        }

      }

System.out.println(" "+ min);

return max ;
}
    public static void main(String[] args) {
        int number = 2343;
        System.out.println(func(number));
    }
}
