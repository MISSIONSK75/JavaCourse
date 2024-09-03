
import java.util.Scanner;
public class Linear_Search {
    int a [] = new int[10]; int key;

    // create method for taking user input

    void getdata() {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++){
            System.out.print("Enter Your No :");
            a [i] = sc.nextInt();
        }

        // inter values . checks no

        System.out.println("Enter Your search no :");
        key = sc.nextInt();
    }

    // create another method for checks the values

    void search(){
      int i, flag = 0 , pos = 0;
      for (i = 0; i < 10 && flag == 0; i++){

          if (a[i] == key){
              flag = 1;
              pos = i ;
          }
      }
      if (flag == 1){
          System.out.println("Number Founded at " +pos);
      }
      else {
          System.out.println("Number Not Founded");
      }
    }
}


// CREATE MAIN METHOD
     class demo1 {
    public static void main(String args[]) {
        Linear_Search aa = new Linear_Search();
        aa.getdata();
        aa.search();
    }
}
