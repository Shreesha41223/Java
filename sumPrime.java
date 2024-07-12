package Java;
import java.util.*;
public class sumPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(!isPrime(x)){
            System.out.println("0");            
        }
        else{
            if(isPrime(sum(x))){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }

    static boolean isPrime(int x){
        if( x == 1)return false;
        for(int i=2; i<=Math.sqrt(x); i++){
            if( x % i == 0){
                return false;
            }
        }
        return true;
    }

    static int sum(int x){
        int s = 0;
        while(x!=0){
            s = s + (x % 10);
            x = x/10;
        }
        return s;
    }
}
