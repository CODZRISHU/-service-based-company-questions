//package numbersystem;
//import java.util.* ;


public class count {
public static char func(char [] num) {
   

  int n =num.length;
  int count =0;
  for(int i =0 ;i<n;i++){
    for(int j =0 ;j<n;j++){
     if(num[i]==num[j]){
        count++;

     }}
    if(count %2 !=0){
        return num[i];
    }
  }



return 0 ;
}
    public static void main(String[] args) {
        char [] number = {'a','b','b','c','a','c','d','B'};
           
         char x = func(number);
        if(x==0)
        {
            System.out.println("all are even");  
        }
        else{ 
            System.out.println(" " + x);
        }
       



    }
}