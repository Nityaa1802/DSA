package Search;

public class binarySearch {


//    static int search(int value,int arr[],int p){
//        if(arr[p]==value)
//            return p;
//        else if(value<arr[p])
//            return search(value,arr,p/2);
//        else
//            return search(value,arr,(p*3/2));




   int  binary(int arr[],int value,int beg,int end) {
       if(beg<=end)
       {
           int mid = (end - beg) / 2;

           if (arr[mid] == value) {
               return mid;
           } else if (value < arr[mid]) {
               return binary(arr, value, beg, mid - 1);
           } else {
               return binary(arr, value, mid + 1, end);
           }}
           return -1;

   }


    public static void main(String[] args) {
         int arr[]={1,12,22,36,45,54,68,76,85,94};
//        int location=search(85,arr,arr.length/2);
//        if(location==-1)
//            System.out.println("value not found");
//        else
//            System.out.println("value found at " + location + " location");
        binarySearch obj=new binarySearch();
        System.out.println(obj.binary(arr, 85, 0, arr.length - 1));

    }
}



/*
*     RECURSIVE CODE
*  int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
    *
    *
    *
    *   ITERATIVE CODE
    *
    *  int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;

            else
                r = m - 1;
        }

        return -1;
    }
    * */
