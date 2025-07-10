import java.util.Scanner;

public class rec9 {
    public static void main(String[] args) {
        int n;
System.out.println("enter n to finad factorial : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int fact = fact(n);
System.out.println("factorial of a no. : "+fact);
        
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
