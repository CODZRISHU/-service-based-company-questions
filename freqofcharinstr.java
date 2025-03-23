package string;


import java.util.* ;
public class freqofcharinstr {
public static String func(String  num) {
     HashMap<Character,Integer> hm = new HashMap<>();
     StringBuilder sb = new StringBuilder();
      
     for(int i =0;i<num.length();i++){

        if((num.charAt(i))==' '){continue;}

         if(hm.containsKey(num.charAt(i))){
            hm.put(num.charAt(i),hm.get(num.charAt(i))+1);
         }else{
            hm.put(num.charAt(i),1);
         }
     }

    for(HashMap.Entry<Character,Integer> it:hm.entrySet()){
             sb.append(it.getKey());
             sb.append(it.getValue());
             sb.append(" , ");
    }
          
     String ABC =sb.toString();
    






return ABC ;
}
    public static void main(String[] args) {
        String number = "rishu kumar jha ji";
        System.out.println(func(number));
    }
}
