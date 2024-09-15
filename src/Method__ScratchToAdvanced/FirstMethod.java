package Method__ScratchToAdvanced;

public class FirstMethod {
    public static void main(String[] args) {
        System.out.println("MISSION SK");

        //CALL METHOD OR FUNCTIONS

        FirstMethod ages = new FirstMethod();
        ages.getAge();

        //CALL SECOND METHOD

        getAge2();

    }


    // CREATE METHOD

    public int getAge(){
        System.out.println("mission sk");
        return 20;
    }

    public static void getAge2(){
        System.out.println("Mission Sk");
    }
}
