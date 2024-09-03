
import java.util.Scanner;
public class Series1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lastNumber;
        int sum = 0;
        System.out.print("Enter your last digit / numbers :");
        lastNumber = sc.nextInt();
        for (int i = 1; i <= lastNumber; i++){
            sum = sum + i;
        }
        System.out.println("The Sum of All Numbers are :" + sum);
    }
}
