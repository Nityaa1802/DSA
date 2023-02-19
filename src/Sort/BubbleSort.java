package Sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,4,2,1,6,3,7};
        bubbleSort(arr);
        printArray(arr);
    }
}
