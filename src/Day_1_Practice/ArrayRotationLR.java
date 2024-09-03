package Day_1_Practice;
import java.util.Scanner;
public class ArrayRotationLR {
    public static void main(String[] args) {
        int [] arr1 = {9 , 8 , 7 , 3 , 2, 1, 6, 5, 4};

        Scanner sc = new Scanner(System.in);

        int d;

        System.out.println("Origina arrays :");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        int n = arr1.length;
       // int d = 5;
        System.out.print("how many position do you want rotate :");
        d = sc.nextInt();

        for (int j = 0 ; j < d; j++){
            int first = arr1[0];

            for (int i = 0; i < n - 1; i++){
                arr1[i] = arr1[i+1];
            }

            arr1[n-1] = first;
        }

        System.out.println("After Rotation arrys are :");
        for (int i = 0 ; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
