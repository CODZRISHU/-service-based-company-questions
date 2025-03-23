package string;


//import java.util.* ;
public class removebraces {
public static StringBuilder func(String num) {

StringBuilder sb = new StringBuilder();

    for(int i =0;i<num.length();i++){
        char ch = num.charAt(i);
        if(ch=='('||ch==')'||ch=='{'||ch=='}'||ch=='['||ch==']'){
            sb.append("");
        }else{
            sb.append(ch);
        }
         

    }


return sb;
}
    public static void main(String[] args) {
        String number = "[12^3{5%6()}]";
        System.out.println(func(number));
    }
}
