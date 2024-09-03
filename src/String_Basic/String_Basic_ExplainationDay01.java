package String_Basic;

public class String_Basic_ExplainationDay01 {
    public static void main(String args[]){
        String name = "bhagwangola balipara";
        String name2 = "kalyani government engineering college";

        // output : bhagwangola balipara
       // System.out.println(name);
       // System.out.println(name2);

        // adding or concate two string;

      //  String add = name +" "+ name2;
        // System.out.println(add);
//        String add1 = name.concat(name2);
//        System.out.println(add1);
//        int len = name.length();
//        System.out.println(len);

        // find the character by using index

//        char ch = name.charAt(1);
//        System.out.println(ch);
//
//        int index1 = name.indexOf("g");
//        System.out.println(index1);
//
//        int index2 = name.lastIndexOf("g");
//        System.out.println(index2);

//        String afterIndexPrint = name.substring(3,15);
//        System.out.println(afterIndexPrint);

        // craete strinbulder for changing and perform some operation

        StringBuffer str = new StringBuffer(name);
        System.out.println(str);

        // adding some elements

//        str.append(" " +"mission sk");
//        str.append( " " +85380);
//        str.append(" " +'M');
//        System.out.println(str);
//
//        //reverse
//
//        str.reverse();
//        System.out.println(str);

//        str.delete(0,5);
//        System.out.println(str);

//        str.setLength(7);
//        System.out.println(str);

        // ASCII VALUE FIND OUT FROM INPUT

//        int ackiivalue = name.codePointAt(3);
//        System.out.println(ackiivalue);



    }
}
