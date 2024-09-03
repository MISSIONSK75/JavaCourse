package String_Practice_day01;

import java.util.Arrays;

public class SortStringCharcter {
    public static void main(String[] args) {

        String name = "sk nur ahmad";


        //APPROACH 1

        /*

        char [] name1 = name.toCharArray();

        char temp;

        for (int i = 0; i < name1.length; i++){
            for (int j = i+1; j <name1.length; j++){
                if (name1[i] > name1[j]){
                   temp = name1[i];
                   name1[i] = name1[j];
                   name1[j] = temp;
                }
            }
        }

        System.out.println(new String(name1));


         */

        //APPROACH 2

        char[] arr = name.toCharArray();

        Arrays.sort(arr);

        System.out.println(new String(arr));
    }
}
