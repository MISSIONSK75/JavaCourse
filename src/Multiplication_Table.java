
// create multiplication table;

import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mul;
        System.out.print("Enter your number :");
        mul = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(mul + "*" + i + " = " + mul*i);
        }
    }
}
