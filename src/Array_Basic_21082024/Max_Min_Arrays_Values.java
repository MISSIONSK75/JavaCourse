package Array_Basic_21082024;

public class Max_Min_Arrays_Values {
    public static void main(String[] args) {
        int [] no = {2, 5, 98, 90, 78, 63, 10, 36, 9};

        int max = no[0];
        for (int i = 0; i < no.length; i++){
            if (max < no[i]){
                max = no[i];
            }
        }

        System.out.println("The Max Number is :");
        System.out.println(max);

        // min values

        int min = no[0];
        for (int i = 0; i < no.length; i++){
            if (min > no[i]){
                min = no[i];
            }
        }

        System.out.println("The Min Values is :");
        System.out.println(min);
    }
}
