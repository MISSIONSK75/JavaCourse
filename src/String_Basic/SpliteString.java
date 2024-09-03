//package String_Basic;
//
//public class SpliteString {
//    public static void main(String args[]){
//        String name = "kalyani government engineering college";
//
//        String [] s1 = name.split(" ");
//        for (String x : s1 ) {
//            System.out.println(x);
//        }
//
//        // reverse string;
//        StringBuffer str = new StringBuffer(name);
//        System.out.println(str);
//
//        String [] s2 = str.split().toString();
//        for (String x1 : s2){
//            System.out.println(x1);
//        }
//
//      //  System.out.println(str.reverse().toString());
//        System.out.println(str.reverse());
//
//
//    }
//}

class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversedString.append(reverseWord.reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }
}

