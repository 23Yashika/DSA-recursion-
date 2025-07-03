import java.util.Scanner;

public class rec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

      int result = fundig(n);
System.out.println("sum of digit : "+result);
        sc.close();
    }

    public static int fundig(int n) {  
         if(n==0){
            return 0;
         }
         return (n%10)+fundig(n/10);
    } 
}
