package Array_Basic_21082024;

public class Array_Rotation_Left_Right {
    public static void main(String[] args) {
        int [] arr1 = {2,3,4,5,6,7,8,9,10,75};

        int n = arr1.length;
        int d = 6;

        System.out.print("Befor arrays are :");
        for (int i = 0; i < n; i++){
            System.out.print(arr1[i]+ " ");
        }

        for (int j = 0; j < d; j++){
            int fast = arr1[0];

            for (int i = 0; i < n-1; i++){
                arr1[i] = arr1[i+1];
            }

            arr1[n-1] = fast;
        }

        System.out.println();

        System.out.print("After arrays are :");
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
    }
}
