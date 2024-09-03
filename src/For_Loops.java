
//FOR LOOPS APPLIES, CALCULATE THE NUMBER FROM 0 TO 999

import java.util.Scanner;
public class For_Loops {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num = sc.nextInt();


        // REVERSE 100 TO 1 LIKE
       /* for (int i = num; i >=0; --i){
            System.out.println("The Number is :" +i);
          //  System.out.print(num);

        */

            for (int i = 1; i<= num; i++) {

                System.out.println("The Number is :"+i);
            }
    }
}
