package Array_Basic_21082024;
import java.util.Arrays;
import java.util.Collections;
public class char_ascending {
    public static void main(String[] args) {
        Character [] ch1 = {'a','k','c','v','d'};

        System.out.println("Original Arrays are :");
        for (int i = 0; i < ch1.length; i++){
            System.out.print(ch1[i]+" ");
        }

        // ascending order convert
        System.out.println("After Ascending order :");
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));

        // DESCENDING ORDER ARRAYS
        System.out.println("After descending arrays are :");
        Arrays.sort(ch1,Collections.reverseOrder());
        System.out.println(Arrays.toString(ch1));

    }
}
