package Array_Basic_21082024;
import java.util.*;
import java.util.Arrays;
public class K_th_Element_Find {
    public static void main(String[] args) {
        int [] num3 = {50,10,90,87,65,1,3,58};
        Arrays.sort(num3);
        System.out.println("Ascending Order Arrays :");
        System.out.println(Arrays.toString(num3));

        int element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kth Elements :");
        element = sc.nextInt();

        System.out.println("Kth smallest element : "+num3[element]);
//       if (element > 0 && element <= num3.length){
//           int kthSmallest =  num3[element];
//           System.out.println(kthSmallest);
//       }
//       else {

//           System.out.println("Out of Bound");
//       }

    }
}
