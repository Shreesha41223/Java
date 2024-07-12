package Java;
import java.util.*;
public class beginPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements : ");
        for( int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int j=0, k=n-1,temp;
        while(j<k){
            if(isPrime(a[j])){
                j++;
            }
            else{
                if(!isPrime(a[k])){
                    k--;
                }
                else{
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    j++;
                    k--;
                }
            }
        }
        System.out.println("Sorted array : ");
        for( int i=0; i<n; i++){
            System.out.print(a[i]+" ");
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
}
