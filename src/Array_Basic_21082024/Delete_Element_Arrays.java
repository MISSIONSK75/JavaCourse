package Array_Basic_21082024;

public class Delete_Element_Arrays {
    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50, 60, 90, 85, 20};
        int delete = 40;
        for (int i = 0; i < a.length - 1; i++){
            if (delete == a[i]){
                for (int j = i; j < a.length -1; j++){
                    a[j] = a[j+1];
                }
                break;
            }
        }
        System.out.println("After Deleting" +" " + delete+" "+ "Remaining Elements are :");
        for (int i = 0; i < a.length - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
}
