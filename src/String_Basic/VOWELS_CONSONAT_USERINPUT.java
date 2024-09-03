package String_Basic;
import java.util.*;
public class VOWELS_CONSONAT_USERINPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input; int vol = 0; int con = 0;
        System.out.print("Enter Your String Input :");
        input = sc.nextLine();
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++){
            char ch1 = input.charAt(i);
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                vol++;
            }
            else  {
                if(ch1 == ' '){
                    continue;
                }

                con++;

            }
        }

        System.out.println(vol);
        System.out.println(con);
    }
}
