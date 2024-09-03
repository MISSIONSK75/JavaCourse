package Array_Basic_21082024;

public class Array_Rotation_Right_Left {
    public static void main(String[] args) {

        int [] arr = {1,5,9,15,20,25,63};

        System.out.println("Before Arrays are :");
        for (int i = 0; i < arr.length; i++){
            System.out.print( " "+arr[i]);
        }

        System.out.println();

        int n = arr.length;
        int d = 3; // ration key, koto bar rotate korte hobe, ekhane 3 bar

        for (int j = 0; j < d; j++){

            int last = arr[n-1];

            for (int i = n-1; i > 0; i--){
                arr[i] = arr[i-1];
            }

            arr[0] = last;

        }

        System.out.println("After Rotation Array are :");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
