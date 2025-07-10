import java.util.Scanner;

public class rec7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         System.out.print("Enter a n number : ");
        n = sc.nextInt();

int arr[] = new int [n];

System.out.println("enter no.of elements ");
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
       
      int result = array(arr,n);
System.out.println("greatest no.in an array : "+result);
        sc.close();
    }

    public static int array(int arr[],int n) {  
       if(n==1){
        return arr[0];
       }else{
         int max = array(arr, n - 1);

        if (arr[n - 1] > max) {
            return arr[n - 1];
        } else {
            return max;
        }
       }
     
    } 
}
