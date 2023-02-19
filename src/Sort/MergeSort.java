package Sort;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int low, int high){

        if(high==low){
            int[] temp={arr[low]};
            return temp;
        }
        else{
            int mid=(low+((high-low)/2));

            int[] first = mergeSort(arr,low,mid);
            int[] second = mergeSort(arr,mid+1,high);
            return mergeTwoSortedArray(first, second);
        }

    }
    public static int[] mergeTwoSortedArray(int[] first,int[] second){
        int merged[] =new int[first.length+second.length];

        int firstPointer=0;
        int secondPointer=0;
        int mergedPointer=0;

        while(firstPointer<first.length && secondPointer<second.length){
            if (first[firstPointer]<second[secondPointer]){
                merged[mergedPointer]=first[firstPointer];
                firstPointer++;
            }
            else {
                merged[mergedPointer]=second[secondPointer];
                secondPointer++;
            }
            mergedPointer++;
        }
        while (firstPointer<first.length){
            merged[mergedPointer]=first[firstPointer];
            firstPointer++;
            mergedPointer++;
        }
        while (secondPointer<second.length){
            merged[mergedPointer]=second[secondPointer];
            secondPointer++;
            mergedPointer++;
        }
        return merged;
    }
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={8,5,4,2,1,6,3,7};

      printArray(mergeSort(arr,0,arr.length-1));


    }
}
