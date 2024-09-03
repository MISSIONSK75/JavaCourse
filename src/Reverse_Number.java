
// Reverse any Number , example , 325 = 523

import java.util.Scanner;
public class Reverse_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, Rev = 0;
        System.out.print("Enter any Number :");
        num = sc.nextInt();
     //   int num2 = num; only for palindrom
        while ( num > 0){
            Rev = (Rev * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println("The Reverse Number are :" +Rev);

//        if (Rev == num2){
//            System.out.println("palindrom"); // this portion is only for palindrom, check a number is palindrom or not
//        }
//        else {
//            System.out.println("not palindrom");
//        }
    }
}

// Logic Portion
//   Rev = (rev * 10) + (num % 10)
//       =   (0 * 10) + ( 7)  // let number is 257
//       =       0 + 7
//       =           7