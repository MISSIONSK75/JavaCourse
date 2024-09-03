package String_Basic;

public class Reverse_String {
    public static void main(String args[]){
    String example = "my name is mission";

    // create a string bulder
        String [] example2 = example.split(" ");

        StringBuffer result = new StringBuffer();
        for (String example3 : example2){
            StringBuffer sb = new StringBuffer(example3);
            sb.reverse();
            result.append(sb.toString()).append(" ");
        }

        String finalRESULT = result.toString().trim();
        System.out.println(finalRESULT);


//        StringBuilder reveres1 = new StringBuilder(reverse);
//
//        StringBuilder result = reveres1.reverse();
//
//        System.out.println(" REVERSE IS :" +result);

    }
}
