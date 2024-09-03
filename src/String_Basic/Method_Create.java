package String_Basic;
import java.util.*;
public class Method_Create {
   public static int add(int a, int b){
     int sum = a + b;
     return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter your Fisrt Number :");
        a = sc.nextInt();
        System.out.print("Enter your second number :");
        b = sc.nextInt();
        int result = add(a,b);
        System.out.print("The Sum is :" +result);
    }
}
