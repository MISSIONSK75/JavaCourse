package Searching_Algorithoms;

    public class Binary_Search {
        public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 100};

        int srch = 30;  // search this on ?

        int li = 0;
        int hi = arr.length-1;
        int mid = (li+hi)/2;

        while (li <= hi)
        {
            if (arr[mid] == srch){
                System.out.println("Index at :" +mid);
                break;
            }
            else if (arr[mid] < srch) {

                li = mid + 1;

            }

            else {
                hi = mid - 1;
            }

            mid = (li+hi)/2;
        }

        if (li > hi){
            System.out.println("Out Of Bound or Not Found");
        }
    }
}
