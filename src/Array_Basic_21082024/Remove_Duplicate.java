package Array_Basic_21082024;
import java.util.HashSet;
public class Remove_Duplicate {
    public static void main(String[] args) {
        int [] ages = {1, 2, 2, 5, 6, 6, 9, 10};
        HashSet <Integer> sb = new HashSet <>();
        for (int i = 0; i < ages.length; i++){
            sb.add(ages[i]);
        }

        //System.out.println(sb);
        System.out.println("After Remove Duplicates The Arrays is :");
        for (int no : sb){
            System.out.print(no + " ");
        }
    }
}
