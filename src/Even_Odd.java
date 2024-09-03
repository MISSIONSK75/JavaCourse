
// Even_Odd checks

    import java.util.Scanner;
    public class Even_Odd {

    public static void main (String args[]){

    Scanner in = new Scanner(System.in);

    int number;

    System.out.print("Enter Any Integer or Numbers :");

    number = in.nextInt();

    if (number % 2 == 0){

        System.out.println("The number is Even");
    }
    else {

        System.out.println("The number is Odd");
    }

//        System.out.print("Enter Any Integer or Numbers :");
//
//        number = in.nextInt();
//
//        int nur = number & 1;
//        if (nur == 0){
//            System.out.println("The number is Even");
//        }
//        else {
//
//            System.out.println("The number is Odd");
//        }


    }
}
