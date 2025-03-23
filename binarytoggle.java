//package numbersystem;
//import java.util.* ;
public class binarytoggle {
public static void func(int num) {
  int binary[] = new int[32];  
  int i =0;   
while(num>0){
     
    if(num%2 ==0){
     binary[i]= 1;   
} 
   else if(num%2 ==1){
     binary[i]= 0;
                      }
     i++;
     num/=2;
}
  
 


 for(int j= i-1; j>=0 ;j--){
    System.out.println(binary[j]+ " ");
}
   


}
    public static void main(String[] args) {
        int number = 10;
        func(number);
    }
}
