package Day_1_Practice;
import java.util.*;
public class PalindromChecks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.print("Enter any number :");
        num1 = sc.nextInt();
        //int num1 = 123;
        int remainder = 0;
        int num2 = num1;

        System.out.println("The Original number is :"+num2);

        while (num1 > 0){
            remainder = (remainder * 10) + (num1 % 10);
            num1 = num1 / 10;
        }

        System.out.println("The Reverse Number is :"+remainder);

        if (num2 == remainder){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Not Palindrom");
        }
    }
}
