
    import java.util.*;
    public class Else_If_Ladder {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter your age :");

        age = sc.nextInt();

        if (age <= 7){

            System.out.println("Teneger");

        }
        else if(age <= 17){

            System.out.println("not Adult");
        }
        else if (age >= 18) {

            System.out.println("Adult");

        }

        else {

            System.out.println("NA");
        }
    }
}
