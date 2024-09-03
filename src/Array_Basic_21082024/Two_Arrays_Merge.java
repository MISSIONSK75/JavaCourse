package Array_Basic_21082024;

public class Two_Arrays_Merge {
    public static void main(String[] args) {
        int [] a = {10, 30, 120};
        int [] b = {40, 50, 60, 70, 80, 90, 100};

        int a_length = a.length;
        int b_length = b.length;
        int c_length = a_length + b_length;

        int [] c = new  int[c_length];

//        int i,j,k;
//        k = 0;
//        for (i = 0,j = 0; i < a_length && j < b_length; ){
//            if(a[i] < b[j]){
//                c[k] = a[i];
//                i++;
//            }else{
//                c[k] = b[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i < a_length){
//            c[k] = a[i];
//            k++;
//            i++;
//        }
//
//        while(j < b_length){
//            c[k] = b[j];
//            k++;
//            j++;
//        }


        for (int i = 0; i < a_length; i++){
            c[i] = a[i];
        }

        for ( int i = 0; i < b_length; i++){
            c[a_length + i] = b[i];
        }

        System.out.println("After Merge the Array are :");
        for (int h = 0; h < c_length; h++){
            System.out.print(c[h]+ " ");
        }
    }
}
