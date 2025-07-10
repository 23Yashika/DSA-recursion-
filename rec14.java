import java.util.Scanner;

public class rec14 {
    public static void main(String[] args) {
        String str;
        System.out.println("enter a string : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String cs = copystr(str,0);
        System.out.println("copied string : "+cs);

    }
    public static String copystr(String str, int i){
        if(i == str.length()){
            return"";
        }else{
            return str.charAt(i)+copystr(str, i+1);
        }
    }
}
