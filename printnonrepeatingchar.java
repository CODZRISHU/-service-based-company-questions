package string;

import java.util.HashMap;

//import java.util.* ;
public class printnonrepeatingchar {
public static void func(String num) {
      num = num.toLowerCase();
     HashMap<Character,Integer> hm = new HashMap<>();
    
     for(int i =0;i<num.length();i++){

        if((num.charAt(i))==' '){continue;}

         if(hm.containsKey(num.charAt(i))){
            hm.put(num.charAt(i),hm.get(num.charAt(i))+1);
         }else{
            hm.put(num.charAt(i),1);
         }
     }

    for(HashMap.Entry<Character,Integer> it:hm.entrySet()){
             if(it.getValue() == 1){
                System.out.print(it.getKey() + " ");
             }
            
    }
 

}
    public static void main(String[] args) {
        String number ="Strsss idjn rishu ko " ;
         func(number); 
    }
}
