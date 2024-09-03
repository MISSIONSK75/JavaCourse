public class SumOfDigit {
    public static void main(String[] args) {
        int x = 12345;
        int digit;
        int sum = 0;

        while (x > 0) {
            digit = x % 10;
            sum = sum + digit;
            x = x /10;
        }

        System.out.println(sum);
    }
}
