
// CHECK THE CHARACTER IS SMALL LETTER OR CAPITAL LETTER

    import java.util.Scanner;
    public class Logical_OR {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Charcter :");
        char ch ;
        ch = sc.next().charAt(0);

        // Applies AND OPERATOR, &&, LOGICAL NOT
        //if (ch >= 97 && ch <= 122)


        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Small Letter");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");
        }
        else {
            System.out.println("Invalid Letter");
        }
    }
}
