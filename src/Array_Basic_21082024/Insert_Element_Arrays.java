package Array_Basic_21082024;

public class Insert_Element_Arrays {
    public static void main(String[] args) {
        int [] a = {2, 5, 9, 3, 58, 90 , 100};
        int pos = 5;
        int element = 150;

        for (int i = a.length-1; i > pos-1; i--){
            a[i] = a[i - 1];
        }
        a[pos-1] = element;
        System.out.println("After Inserting New Element , New Arrays are Looks Like A :");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
