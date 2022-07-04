package nativealgoritm.searching.binarysearch.example1;

public class Main {
    public static void main(String args[]){

        int arr[] = {0, 25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90};
        int key = 10;
        int last = arr.length - 1;
        BinarySearchExample.binarySearch(arr,0, last, key);
    }
}
