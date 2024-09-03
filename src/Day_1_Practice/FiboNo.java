package Day_1_Practice;

public class FiboNo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int maximumNo = 1999;

        System.out.println("Fibonacie Series are :");
        while (sum <= maximumNo){
            System.out.print(sum+" ");
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }
    }
}
