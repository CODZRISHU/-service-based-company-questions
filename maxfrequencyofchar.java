package string;



import java.util.* ;
public class maxfrequencyofchar {
public static int func(String num) {
  HashMap<Character,Integer> hm = new HashMap<>();
       for(int i =0;i<num.length();i++){
            if(hm.containsKey(num.charAt(i))){
                 hm.put(num.charAt(i),hm.get(num.charAt(i))+1);
            }else{
                hm.put(num.charAt(i),1);
            }
       }
           int max = Integer.MIN_VALUE;
     for(HashMap.Entry<Character,Integer> it : hm.entrySet()){
               if(it.getValue()>max){
                  max =it.getValue();
               }
     }

return max ;
}
    public static void main(String[] args) {
        String number ="rrrrish" ;
        System.out.println(func(number));
    }
}
