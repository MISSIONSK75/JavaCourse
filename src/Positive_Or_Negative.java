
// using selection
//1. if
//2. if else
//3. switch


    import java.util.Scanner;
    public class Positive_Or_Negative {

    public static void main(String args []) {

    Scanner in = new Scanner (System.in);

    int num;

    System.out.print("Enter Any Number :");

    num = in.nextInt();

    if (num > 0){  // using if selection

        System.out.print("The Number is Positive ");
    }

    else {  // using if else selection

        System.out.print("The Number is Negative");
    }

    }
}
