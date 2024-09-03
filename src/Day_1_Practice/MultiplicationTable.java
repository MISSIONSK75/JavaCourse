package Day_1_Practice;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num =  9;

       // System.out.println("Multiplication table is :");
        for (int i = 1; i <= 10; i++){
            System.out.println(num+ " * "+ i+" "+ " = "+ num*i);
            //System.out.print((num*i)+" ");
        }
    }
}
