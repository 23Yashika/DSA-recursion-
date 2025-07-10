import java.util.Scanner;

public class rec8 {
    public static void main(String[] args) {
        String str;
        System.out.println("enter a string ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String rev = rev(str);
        System.out.println("reversed String : "+rev);
    }
    public static String rev(String str){
        if(str.isEmpty()){
            return str;
        }else{
            return rev(str.substring(1)) + str.charAt(0);
        }
    }
}
