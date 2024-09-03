
//switch statement explaination

    import java.util.*;
    public class Switch {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    char ch;
    System.out.print("Enter an Elements :");
    ch = sc.next().charAt(0);
    ch = Character.toLowerCase(ch);
    switch (ch){
        case 'a':
            System.out.println("Vowel");
            break;
            case 'e':
            System.out.println("Vowel");
            break;
            case 'i':
            System.out.println("Vowel");
            break;
            case'o':
            System.out.println("Vowel");
            break;
            case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Constant");
        }
    }
}
