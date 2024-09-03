package Day_1_Practice;

import java.util.*;

public class ArrayRotationRL {
    public static void main(String[] args) {

        int [] arr = {9,8,7,4,5,6,8,25};

        Scanner sc = new Scanner(System.in);
        int d;

//        System.out.print("Enter Arrays Element :");
//        n = sc.nextInt();

        System.out.println("original arrays is :");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("Enter position :");
        d = sc.nextInt();


       int n = arr.length;
       // int d = 4;

        for (int j = 0 ; j < d; j++){
            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--){
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.println("After rotaion arrays are :");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
