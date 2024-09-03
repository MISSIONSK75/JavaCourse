package Day_1_Practice;
import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
       // int num = 789456;

        System.out.print("Enter any number sequences :");
        num = sc.nextInt();
        int sum =0;
        int digit;

        while (num > 0){
          digit = num % 10;
          sum = sum + digit;
          num = num / 10;
        }

        System.out.println("The sum of digit is "+ sum);
    }
}
