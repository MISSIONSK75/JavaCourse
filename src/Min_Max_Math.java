
// Math Class

public class Min_Max_Math {
    public static void main(String args[]){
        int x = 2;
        int y = 3;
        int z = -15;
        int Max, Min;

        Max = Math.max(x,y);

        System.out.print("Maximum is :");

        System.out.println(Max);

        Min = Math.min(x,y);

        System.out.print("Minimum is :");

        System.out.println(Min);

        System.out.println("Absolute Value is :");

        int absolute = Math.abs(z);

        System.out.println(absolute);

        double power = Math.pow(x,y);

        System.out.println("y power of x is :" + power);
    }
}
