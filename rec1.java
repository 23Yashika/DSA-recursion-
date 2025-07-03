import java.util.*;

public class rec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number upto where you want to sum: ");
        int n = sc.nextInt();

        int res = funsum(n);   
        System.out.println("sum is: " + res);  

        sc.close();
    }

    public static int funsum(int n) {  
        if (n == 0) {
            return 0;
        }
        return n + funsum(n - 1);
    }
}
