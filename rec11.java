import java.util.Scanner;

public class rec11 {
    static int i=2;
    public static void main(String[] args) {
        int n;
System.out.println("enter n to finad factorial : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
if(isPrime(n)){
    System.out.println("no. is prime");
}else{
    System.out.println("not prime");
}

        
    }
    public static boolean isPrime(int n){
       
        
        if(i == n/2+1){
            return true;
        }
        if(n%i == 0){
            return false;
             
        }
         i++;
            return isPrime(n);
      
    }
}

