//package numbersystem;
//import java.util.* ;
public class mostperinship {
public static int func(int [] num,int []leave) {
       int n= num.length;
       int max =Integer.MIN_VALUE;
       int per = 0;
       
       int i =0;
       int j = i;
       while(i<n){
        per+=num[i];
        per = per -leave[j];

         if(per>max){
            max =per;
         }
       //per+=num[i+1];
          i++;
         j++;

       }



return max ;
}
    public static void main(String[] args) {
        int[] number ={3,5,2,0} ;
        int[] leave ={0,2,4,4} ;
        System.out.println(func(number,leave));
    }
}

