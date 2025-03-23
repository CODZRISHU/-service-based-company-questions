//import java.util.* ;

import java.util.HashMap;

public class freqoptimal {
public static void func(int [] arr) {
    HashMap <Integer,Integer> mp =new HashMap<>();
         
    for(int i =0; i< arr.length;i++){
        if(mp.containsKey(arr[i])){
          mp.put(arr[i], mp.get(arr[i])+1);
        }
        else{
            mp.put(arr[i],1);
        }
    }
     for(HashMap.Entry<Integer,Integer> j: mp.entrySet() ){
       System.out.println(j.getKey() + " " + j.getValue());
     }


}
    public static void main(String[] args) {
        int[] arrayname = {100, 2, 100,100,2,2,800,900,900};
        func(arrayname);
    }
}
