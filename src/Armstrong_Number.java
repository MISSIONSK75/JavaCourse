
// ARMSTRONG NUMBER;

import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, temp, rem, sum = 0;

        System.out.println("Enter any number :");
        num = sc.nextInt();
        temp = num;
        while ( temp > 0){
            rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }

        if (num == sum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
