    package String_Basic;
    import java.util.*;
    public class ReverseString2 {
    public static void main(String[] args) {

      //  ->->-> NORMAL REVERSE
//        String a = "MISSION SK 85965";
//        StringBuffer sb = new StringBuffer(a);
//        String b = sb.reverse().toString();
//        System.out.println(b);

        // USER INPUT
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Fav Numbers :");
        a = sc.nextLine();
         StringBuffer sn = new StringBuffer(a);
         String result = sn.reverse().toString();
        System.out.println("Your Reverse Result is :");
        System.out.println(result);


    }
}
