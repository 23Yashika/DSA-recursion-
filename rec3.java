import java.util.Scanner;

public class rec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
System.out.println("enter elements in array");
int arr[] = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }

    System.out.print("array element : ");
      funarr(arr,0);

        sc.close();
    }

    public static void funarr(int a[],int i) {  
          if (i == a.length) {
            return; 
        }
        System.out.print(a[i] + " ");
        funarr(a, i + 1);
    }
}

