package Day_1_Practice;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        //int x = 37;

        System.out.print("Enter any Number :");
        x = sc.nextInt();

        for ( int i = 2; i < x; i++){
            if (x % i == 0){
                System.out.println("Not Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");
    }
}
