package Day_1_Practice;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter any number Sequences :");
        num = sc.nextInt();
       // int num = 752628;
        int remainder = 0;

        while (num > 0) {
            remainder = (remainder * 10) + (num % 10);
            num = num / 10;
        }

        System.out.println("The Reverse Number is :"+ remainder);
    }
}
