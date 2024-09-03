package String_Practice_day01;

public class String_Reverse {
    public static void main(String[] args) {

        String name = "mission sk abhi sk";

        System.out.println(name);

        // APPROACH 1

        /*

        StringBuffer sb = new StringBuffer(name);

        String revString = sb.reverse().toString();

        System.out.println(revString);


         */


        // APPROACH 2

      /*  char [] chArray = name.toCharArray();

        for (int i = chArray.length - 1; i >= 0; i--){
            System.out.print(chArray[i]);
        }


       */


        //APPROACH 3

        for (int i = name.length() - 1; i >= 0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
