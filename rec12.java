import java.util.Scanner;

public class rec12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range number: ");
        int r = sc.nextInt();

        System.out.print("Enter 1 for Even, 2 for Odd: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Even numbers:");
            even(1, r);
        } else if (choice == 2) {
            System.out.println("Odd numbers:");
            odd(1, r);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

  public static void even(int i,int rng){
    if(i> rng)
    return;
    if(i%2 == 0)
    System.out.print(i+" ");
    even(i+1, rng);
  }

    public static void odd(int i, int rng) {
        if (i > rng)
            return;

        if (i % 2 != 0)
            System.out.print(i + " ");

        odd(i + 1, rng);
    }
}
