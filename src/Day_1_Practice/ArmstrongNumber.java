package Day_1_Practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 3;
        int sum = 0;
        int remainder;

        int temp = num;

        while(temp > 0){
            remainder = temp % 10;
            sum = sum + (remainder * remainder * remainder);
            temp = temp / 10;
        }

        if (num == sum){
            System.out.println( num +"This Number is ARMSTRONG NUMBER :");
        }

        else {
            System.out.println( num +"This Number is Not ARMSTRONG NUMBER :");
        }
    }
}
