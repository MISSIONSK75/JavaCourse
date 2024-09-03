package Array_Basic_21082024;

import java.util.Arrays;
import java.util.Collections;
public class Descending_Arrays {
    public static void main(String[] args) {
        int [] arr = {5, 9, 2, 7, 10, 98, 58, 36};
        Integer [] arr2 = {9,4,2,8,10,75,54};
        System.out.println("Original Array are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Ascending order
        Arrays.sort(arr);
        System.out.println("After Ascending order :");
        System.out.println(Arrays.toString(arr));

        System.out.println("original arrays are :");
        for (int j = 0; j < arr2.length; j++){
            System.out.print(arr2[j]+ " ");
        }


        System.out.println();

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("After Discending order arrays are :");
        System.out.print(Arrays.toString(arr2));


    }
}
