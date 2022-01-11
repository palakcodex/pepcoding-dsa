import java.util.*;

public class p_subsequence {
 
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str,"");
    }

    public static void printSS(String str , String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String s = str.substring(1);
        printSS(str, ans+ch);
        printSS(str, ans);
    }
}
