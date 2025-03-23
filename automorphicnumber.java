
package numbersystem;
//import java.util.* ;
public class automorphicnumber {

//my approach

public static boolean func(int  num) {
         int count =0;
         int temp = num;
         int res= 0;
         int rm=0;
        while(num!=0){
          int rem = num%10;
           res = res*10+rem;
          count++;
          num/=10;
        }
       temp=temp*temp;
       while(count>0){
          int r = temp%10;
           rm= rm*10+r;
          temp/=10;
          count--;
       }
     if(res==rm){
      return true;
     }
       


return false ;
}

// second approach less line of code

public static boolean func1(int  num) {
    int sq =num*num;

   while(num!=0){
      if(num%10 != sq%10){
         return false;
      }
      num/=10;
      sq/=10;
   }

return true;
}



    public static void main(String[] args) {
        int number = 76;
        if(func(number))
        System.out.println("automorphic");
        else{
          System.out.println(" not automorphic");
        }


        if(func1(number))
        System.out.println("automorphic");
        else{
          System.out.println(" not automorphic");
        }


    }
}
