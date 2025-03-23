package numbersystem;
//import java.util.* ;
public class perfect {
public static int func(int [] num) {
   int  count=0;
    for(int i =0; i<num.length;i++){
          double sq = Math.sqrt(num[i]);
            if(sq*sq == num[i]){
                count++;
            }
    }
return count ;
}
    public static void main(String[] args) {
        int [] number = {64,16,38,81,100};
        System.out.println(func(number));
    }
}