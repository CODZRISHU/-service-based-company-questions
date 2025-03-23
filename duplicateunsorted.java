//import java.util.* ;
public class duplicateunsorted {
public static void func(int [] arr) {
    int n = arr.length;
    int [] mark = new int[n];
     
    for(int i = 0;i<n;i++){
         mark[i] = 1;
    }


    for(int i = 0;i<n;i++){
        
            if(mark[i]==1){
                for(int j = i+1;j<n;j++){
                    if(arr[i]==arr[j])
                      mark[j] = 0;
                                        }
        }
    } 
    

    


}
    public static void main(String[] args) {
        int[] arrayname = {2,3,4,3,3,3,};
        func(arrayname);
    }
}