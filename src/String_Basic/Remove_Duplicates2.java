package String_Basic;

public class Remove_Duplicates2 {
    public static void main(String[] args) {
        String number = " mission";
        boolean [ ] seen = new boolean[25600]; // any number input into boolean arrays
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            if (!seen[ch]){
                seen[ch] = true;
                sb.append(ch);
            }
        }

        String result = sb.toString();
        System.out.println("Befor Remove Duplicates :" + number);
        System.out.println("After Remove Duplicates :" + result);

        System.out.println(number.length());
    }
}
