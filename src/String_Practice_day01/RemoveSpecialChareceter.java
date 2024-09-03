package String_Practice_day01;

public class RemoveSpecialChareceter {
    public static void main(String[] args) {

        String str = "$mi%ss&i*@o#n";

        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str1);
    }
}
