package Day_1_Practice;

public class GCD_FindOut {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 15;

        while (num1!=num2){

            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.println(num2);
    }
}
