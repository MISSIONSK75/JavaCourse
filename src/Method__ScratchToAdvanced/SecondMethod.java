package Method__ScratchToAdvanced;

public class SecondMethod {
    public static void main(String [] args){

        int rameAge = 20;
        int tomAge = 23;

        //CALL THE METHOD
        System.out.print("Ram age is :");
        getAge(rameAge);
        System.out.print("Tom age is :");
        getAge(tomAge);
    }

    // CREATE METHOD

    public static int getAge(int age){
        System.out.println(age);
        return 0;

        //jodi data type ta int na kore void kori tahole Ruturn type lekhar dorkar nei....

    }
}
