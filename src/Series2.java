
// 1+3+5+7+.......+n , solve kora holo ai question ta,, 15-08-2024


import java.util.Scanner;
public class Series2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int lastNo;
        System.out.println("Enter last no :");
        lastNo = sc.nextInt();
        for (int i = 1; i <= lastNo; i = i + 2){
            sum = sum + i;
        }
        System.out.println("The sum is :"+sum);
    }
}
