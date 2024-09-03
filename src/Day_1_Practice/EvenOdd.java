package Day_1_Practice;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
       // int a = 10;

        System.out.print("Enter any number :");
        a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("The No is EVEN");
        }
        else {
            System.out.println("The No is ODD");
        }
    }
}
