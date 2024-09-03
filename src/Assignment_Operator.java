
// ASSIGNMENT OPERATOR EXPLAINATION, =, +=, -= ,*=, /=, %=


    public class Assignment_Operator {

    public static void main (String args []) {

        int x, y, ans;

        x = 35;
        y = 8;

        System.out.println("Your Answer is :");

        //ans = x+y;

        x += y;

        System.out.println(x);

        System.out.println("Your Answer is :");

        x -= y;

        System.out.println(x);

        System.out.println("Your Answer is :");

        x *= y;

        System.out.println(x);

        System.out.println("Your Answer is :");

        x /= y;

        System.out.println(x);

        System.out.println("Your Answer is :");

        x %= y;

        System.out.println(x);

        // post increment , ++ ,  post decrement, --

        System.out.println("Your Answer is :");

        //x = x++;

        ans = x++;

        System.out.println(ans);

        System.out.println("Your Answer is :");

        ans = x--;

        System.out.println(ans);


    }
}
