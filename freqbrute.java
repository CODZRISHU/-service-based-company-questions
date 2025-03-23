//import java.util.* ;
public class freqbrute {
public static void func(int [] arr) {
 
  int n = arr.length;

  boolean visited[] = new boolean[n];
    for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            int count =1 ;
        for(int j =i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                visited[j]=true;
                count++;
            }
        }
        System.out.println(arr[i] +"-> " + count);
    }

    
          
}
    public static void main(String[] args) {
        int[] arrayname = {15, 20, 20,34,22,15,-1,-1,19,19};
         func(arrayname);
    }
}
