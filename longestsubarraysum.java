
//import java.util.* ;
public class longestsubarraysum {
public static int func(int [] num) {
int n = num.length;
int maxi=Integer.MIN_VALUE;
int prefix =0;
for(int i =0;i<n;i++){
    prefix +=num[i];
    maxi = Math.max(maxi, prefix);
    if(prefix <0){
        prefix =0;
    }
}

return maxi ;
}
    public static void main(String[] args) {
        int []number = {3,4,0,7,6};
        System.out.println(func(number));
    }
}
