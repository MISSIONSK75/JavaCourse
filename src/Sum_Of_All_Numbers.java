public class Sum_Of_All_Numbers {
    public static void main(String args[]){

        // sum of all numbers
       int sum = 1;
        for (int i = 0; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println("The Sum is :" +sum);

      // sub of al numbers

        int sum1 = 100;
        for (int i = 0; i <= 10; i++){
            sum1 = sum1 - i;
        }

        System.out.println("The Substraction is :" +sum1);

        // Multiplication of all numbers

        int sum2 = 1;
        for (int i = 1; i <= 9; i++){
            sum2 = sum2 * i;
        }

        System.out.println("The Multiplication is :" +sum2);
    }
}
