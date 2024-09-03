package Pattern;

    public class NumberPattern1 {
    public static void main(String[] args) {
        int i, j, number,row = 6;

       // for (i=0;i<row;i++){
        for (i=row-1;i>=0;i--){
            number = 1;

            for (j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }

            System.out.println();
        }
    }
}
