package main.java.ru.mai.is.tmp.students.example.data;

/**
 * @author
 */
public class Sorter {

    public static void insertionSort(int[] arr){
        int x;
        int j;
        for(int i=0;i<arr.length;i++){
            x=arr[i];
            j=i;
            while(j>0&&x<arr[j-1]){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=x;
            System.out.println("change "+arr[i]+" to "+x);
        }
    }

    public static void selectionSort(int arr[]){
        int x;
        int k;
        for(int i=0;i<arr.length-1;i++){
           k=i;
           x=arr[i];
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<x){
                   k=j;
                   x=arr[k];
               }
           }
            arr[k]=arr[i];
            arr[i]=x;
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=1; i < n; i++) {
            for (int j=0; j < n-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int binarySearch (int arr[], int low, int high, int key)
    {
        int middle;
        if (low == high)
            return low;
        middle = low + ((high - low) / 2);
        if (key > arr[middle])
            return binarySearch (arr, middle + 1, high, key);
        else if (key < arr[middle])
            return binarySearch (arr,low,middle, key);
        return middle;
    }

    public static void binaryInsertionSort(int[] arr){
        int ins, i, j;
        int tmp;

        for (i = 1; i < arr.length; i++) {
            ins = binarySearch (arr, 0, i, arr[i]);
            tmp = arr[i];
            for (j = i - 1; j >= ins; j--)
                arr[j + 1] = arr[j];
            arr[ins] = tmp;
        }
    }

    public static void main(String[] args){
        int[] array=new int[]{1,5,12,17,15,91,35,112,89};
        //insertionSort(array);
        //binaryInsertionSort(array);
        //selectionSort(array);
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
