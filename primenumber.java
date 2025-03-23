package numbersystem;
//import java.util.* ;
public class primenumber {
public static int func(int  num) {
    int c =0;
   
    for(int i=2;i<=num/2;i++ ){

        if(num%i==0){
            c++;
        }

    }
    if(c==0){
        return 1;
    }
     
return 0 ;
}
    public static void main(String[] args) {
        int number = 0;
       
        if(func(number)==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    
    }
}
