    public class String_Practice {
    public static void main(String args[]){
        String fName;
        fName = "Mission Sk";
        System.out.println( "Your Name is :" +fName);

        // calculating length of string

        int stringLength = fName.length();
        System.out.println("String Length is :" + stringLength);

        // Convert to lower case of all characters

        String toLowerCase = fName.toLowerCase();
        System.out.println(toLowerCase);

        // convert to upper case of all characters

        String toUpperCase = fName.toUpperCase();
        System.out.println(toUpperCase);

        // replace character from fname

       // String change = fName.replace("sion","oooo"); // onek gulo change
        String change = fName.replace("M","A");
        System.out.println(change);

        // trim ,,,, mane space remove kora

        String removeSpace = fName.trim();
        System.out.println(removeSpace);

        // print after some index
       String subString = fName.substring(2);
        System.out.println(subString);

        // after to end

        String startToEnd = fName.substring(1,6);
        System.out.println(startToEnd);

        // return charcter using there indexing,,,

        Character charIndex = fName.charAt(5);
        System.out.println(charIndex);

        // find index of any character

        int indexOfChar = fName.indexOf("i");
        System.out.println(indexOfChar);


        // checks equal,,

        boolean checkName = fName.equals("mission Sk");
        System.out.println(checkName);

        // capital and small letters or characters are ignore,,,

        boolean isTrueOrFalse = fName.equalsIgnoreCase("mission sk");
        System.out.println(isTrueOrFalse);

        // UNICODE / ASCII Values find out using string,,,

        int UnicodeValue = fName.codePointAt(0);
        System.out.println(UnicodeValue);

    }
}
