package numbersystem;
//import java.util.* ;
public class power {
public static double func(double num,double pow) {
    
    double ans = 1;
    //double x = pow;

    if(num==0 || num==1){
        return num;
    }

    if(pow < 0){
        num = 1/num;
        pow = -(pow +1);
        ans = ans*num;

    }

     while(pow>0){
       
        if(pow % 2 ==1)
        {
            ans = ans * num;
            pow = pow-1;
        }
            
     else{
         pow = pow/2;

         ans = num *num;
     }

     }
    

return ans;
}
    public static void main(String[] args) {
        double number = 2;
        int power= 8;
        System.out.println(func(number,power));
    }
}