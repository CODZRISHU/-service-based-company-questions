//package numbersystem;
//import java.util.* ;

import java.util.Arrays;

public class segregatearray {
 static  void  func(int [] num) {

   int n =num.length;
   int i = 0;
   int j = n-1;

   while(i<j){
    if(num[i]==0)
    {
      i++;  
    }else{

        if(num[j]==0){
            int temp = num[j];
            num[j]=num[i];
            num[i]=temp;

            i++;
            j--;
        }else{
            j--;
        }
    }
   }


    System.out.print(Arrays.toString( num )+ " ");
 


}
    public static void main(String[] args) {
        int []number = {0,0,1,1,0};
        func(number);
    }
}