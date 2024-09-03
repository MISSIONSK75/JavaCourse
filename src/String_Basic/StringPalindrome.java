package String_Basic;

public class StringPalindrome {
    public static void main(String args[]){
        String s1 = "Mam";
        s1 = s1.toLowerCase();
        StringBuffer s2 = new StringBuffer(s1);
        String s3 = s2.reverse().toString();
        System.out.println(s3);
        if (s1.equals(s3)){
            System.out.println("PALINDROM NUMBER");
        }
        else {
            System.out.println("NOT PALINDROM NUMBER");
        }
    }
}
