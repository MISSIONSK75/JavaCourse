package String_Basic;

public class Reverse_EachWordsFor_String {
    public static void main(String[] args) {
        String name = "Mission Sk Abhi";
        String [] word = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word2 : word){
            StringBuilder sn = new StringBuilder(word2);
            sn.reverse();
            result.append(sn.toString()).append(" ");
        }
        String finalResult = result.toString().trim();
        System.out.println(finalResult);
    }
}
