package String_Practice_day01;

 public class RemoveSpace {
    public static void main(String[] args) {

        String str = "mission    sk";

        String removeSpace = str.replaceAll("\\s", "");

        System.out.println(removeSpace);
    }
}
