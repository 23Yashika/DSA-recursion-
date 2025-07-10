import java.util.Scanner;

public class rec10 {
    public static void main(String[] args) {
        int n;
System.out.println("enter n to finad factorial : ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
dtob(n);

        
    }
    public static void dtob(int n){
        if(n == 0)
        return;
        dtob(n/2);
        System.out.print(n%2);
    }
}

