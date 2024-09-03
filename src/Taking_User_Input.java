
//Taking User INput FROM USER


import java.util.Scanner;
public class Taking_User_Input {

    public static void main (String args []) {

        Scanner sc = new Scanner (System.in);

        int a , b;

        System.out.println ("Enter your First no :");
        a = sc.nextInt();

        System.out.println ("Enter your Second no :");
        b = sc.nextInt();

        int Sum = a + b;
        int Sub = a - b;
        int Mul = a * b;
        int Div = a / b;
        int Rem = a % b;

        System.out.println ("The Sum is :");

        System.out.println(Sum);

        System.out.println ("The Sub is :");

        System.out.println(Sub);

        System.out.println ("The Mul is :");

        System.out.println(Mul);

        System.out.println ("The Div is :");

        System.out.println(Div);

        System.out.println ("The Rem is :");

        System.out.println(Rem);
    }
}
