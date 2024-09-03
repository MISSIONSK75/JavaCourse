
import java.util.Scanner;
public class Binary_Search {
    int a [] = new int[5];

    // create method for taking input from user
    int i ; int key;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++){
            System.out.print("Enter Your Number :");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Your Search Number :");
        key = sc.nextInt();
    }

    // create method for logic building or Checks the number are exists in array or not

    void search(){
        int i,j, flag, mid, pos;
        i = 0;
        j = 9;
        flag = 0;
        pos = 1;

        while (i < j && flag == 0){
           mid = (i + j) / 2;

           if (a [mid] == key){
               flag = 1;
               pos = mid + 1;
           }
           if (a[mid] > key){
               j = mid - 1;
           }

           if (a[mid] < key){
               j = mid + 1;
           }

           if ( flag == 0){
               System.out.println("The Number is not found");
           }
           else {
               System.out.println("The Number is Founded at " +pos);
           }
        }
    }
}
    class demo {
    public static void main(String args[]){
        Binary_Search aa = new Binary_Search();
        aa.getdata();
        aa.search();

    }
}
