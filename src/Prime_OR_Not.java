
// Checks any number prime or not by using LOOPS
    public class Prime_OR_Not {
    public static void main(String args[]){
        int x = 19;
//        int count = 0;
//        for (int i = 2; i < x; i++){
//            if (x % i == 0){
//                count++;
//                break;
//            }
//        }
//        if (count == 0){
//            System.out.println("The numbers is PRIME" );
//        }
//        else {
//            System.out.println("The numbers is NOT PRIME" );
//        }
        for(int i = 2;i < x ; i++){
            if(x % i == 0){
                System.out.println("This is not a prime number.");
                return;
            }
        }
        System.out.println("This is a prime number.");
    }
}
