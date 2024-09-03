package Array_Basic_21082024;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class String_Sort {
    public static void main(String[] args) {
        String [] str = {"Hi", "Vi", "Good", "Morning", "Mission", "Sohan", "Nur", "Abhi"};

        int arraySize = str.length;
        System.out.print("The Length is :"+ arraySize);

        System.out.println();
        System.out.println(str[5]);

        System.out.println();
        System.out.println();

        System.out.println("ORIGINAL ARRAYS IS :");
        for (int i = 0; i < str.length; i++){
            System.out.print(str[i]+ " ");
        }


        System.out.println();


        System.out.println();

        // ASCENDING ORDER ARRAYS
        System.out.println("After Ascending arrays :");
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println();

        // DESCENDING ORDER ARRAYS
        System.out.println("After descending order arrays :");
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println(Arrays.toString(str));


    }
}
