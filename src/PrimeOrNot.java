//public class PrimeOrNot{
//    public static void main(String [] args){
//
//        int x = 77;
//
//        for (int i = 2; i < x; i++){
//            if(x % i == 0){
//                System.out.println("This is Not a Prime Number ");
//                return;
//            }
//        }
//
//        System.out.println("This is Prime Number");
//
//    }
//}

public class PrimeOrNot{
    public static void main(String [] args){

        int x = 7;
        int count = 0;

        for (int i = 2; i < x; i++){
            if(x % i == 0){
                count++ ;
                break;
            }
            }

        if (count == 0){
            System.out.print("This is a Prime Number ");
        }
        else{
            System.out.println("This is not Prime Number");

        }

    }
}