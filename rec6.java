import java.util.Scanner;

public class rec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two number : ");
        int a = sc.nextInt();
         int b = sc.nextInt();

      int result = gcd(a,b);
System.out.println("gcd of a no. is : "+result);
        sc.close();
    }

    public static int gcd(int a,int b) {  
        if(b==0){
            return a;
        }else{
   return gcd(b, a%b);
        }
     
    } 
}
