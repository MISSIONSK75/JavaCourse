

// FIBONACEI SERIES PROGRAM RUN,  LIKES = 0,1,1,2,3,5,8,13,21,34,55........

import java.util.Scanner;
    public class Fibonacei_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 1, sum = 0, maxNo;
        System.out.print("Enter Max Number :");
        maxNo = sc.nextInt();
        while ( sum <= maxNo){
            System.out.println("The fibonacies series are :"+sum);
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }
    }
}
