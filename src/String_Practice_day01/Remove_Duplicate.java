package String_Practice_day01;

public class Remove_Duplicate {
    public static void main(String[] args) {

        String str = "mission sk";

        char[] str1 = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str1.length; i++){
            boolean repeated = false;

            for (int j = i+1; j < str1.length; j++){
                if (str1[i] == str1[j]){
                    repeated = true;
                    break;
                }
            }

            if (!repeated){
                sb.append(str1[i]);
            }
        }

        System.out.println(sb);
    }
}
