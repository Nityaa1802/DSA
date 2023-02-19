package Sort;

import java.util.Queue;

public class QuickSort {

    static void quickSort(int arr[],int beg,int end){
        if(beg>end)
            return;
            int pi=swap(arr,beg,end);
            quickSort(arr,beg,pi-1);
            quickSort(arr,pi+1,end);
        }

    static int swap(int arr[],int beg,int end ){
        int pivot=arr[end];
        int i=beg;
        int j=beg;
        while(i<=end){
            if(arr[i]<=pivot) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else {
                i++;
            }
        }
        return j-1;
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,4,2,1,6,3,7};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
