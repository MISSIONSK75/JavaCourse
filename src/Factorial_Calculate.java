
// calculate factorial , like 5! = 5*4*3*2*1 = 120

import java.util.Scanner;
    public class Factorial_Calculate {
    public static void main(String args[]){
        int fact = 1;
        int factNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive numbers :");
        factNo = sc.nextInt();
        for (int i = factNo; i >= 1; i--){
           fact = fact * i;
        }
        System.out.println("The Factorial is :"+fact);
    }
}
