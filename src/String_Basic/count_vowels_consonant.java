package String_Basic;

public class count_vowels_consonant {
    public static void main(String[] args) {
        String input = "mission SK Abhi";
        input = input.toLowerCase();
        int vols = 0; int cons = 0;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vols++;
            } else if (ch >= 'a' && ch <= 'z') {
                cons++;

            }
        }

        System.out.println("Total Numbers of Vowel is :" + vols);
        System.out.println("Total Numbers of Consonant is : " + cons);
    }
}
