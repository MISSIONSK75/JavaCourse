package Array_Basic_21082024;

public class Basic1 {
    public static void main(String[] args) {
        int [] number = new int[5];
        number[0] = 10;
        number[1] = 15;
        number[2] = 20;
        number[3] = 25;
        number[4] = 30;
        for (int i = 0; i < 5; i++){
            System.out.println(number[i]);
        }
        System.out.println();

        // ANOTHER ARRAY

        int [] num = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);

        }
        // lenth calculate

        int len = num.length;
        System.out.println("The Length is :" + len);

        // reverse array

        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(" " +num[i]);
        }

        // SORT ARRAYS 1 -> ascending order , -> descending order


    }
}
