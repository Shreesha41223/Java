package Java;
import java .util.*;
public class specialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int len = x.length();
        int tsc = 0;
        for(int i=0; i<len; i++){
            if(isSpecial(x.charAt(i))){
                tsc++;
            }
        }
        System.out.println("Number of Special Charecter : "+tsc);
    }

    static boolean isSpecial(char x){
        if(!Character.isLetterOrDigit(x)){
            if(!Character.isWhitespace(x)){
                return true;
            }
        }
        return false;
    }
}