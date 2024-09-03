package Day_1_Practice;

public class gcdofthreeno {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 20;
        int num3 = 15;

        while (num1!=num2){
            if (num1>num2){
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        int gcd12 = num1;

        while (gcd12!=num3){
            if (gcd12>num3){
                gcd12 = gcd12 - num3;
            }
            else {
                num3 = num3 - gcd12;
            }
        }

        System.out.println(gcd12);
    }
}
