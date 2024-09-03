package Searching_Algorithoms;

public class Linear_Search {
    public static void main(String[] args) {
        int [] arr = {10, 2, 52, 8, 9, 1 , 78};

        int item = 1; // search 1 ?
        int temp = 0; // if not exists the elements ?

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item){
                temp = temp + 1;
                System.out.println("The Element index is :" +i);
            }
        }

        if (temp == 0){
            System.out.println("The Elements is out off bound or range ");
        }
    }
}
