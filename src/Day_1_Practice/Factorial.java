package Day_1_Practice;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int fact = 1;

        for (int  i = number; i >= 1; i--){
            fact = fact * i;
        }

        System.out.println(number+ " "+ "Factorial is :"+fact);
    }
}
