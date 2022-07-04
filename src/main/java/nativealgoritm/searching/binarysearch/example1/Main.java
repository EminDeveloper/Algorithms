package nativealgoritm.searching.binarysearch.example1;

public class Main {
    public static void main(String args[]){

        int arr[] = {10,20,30,40,50};
        int key = 10;
        int last = arr.length - 1;
        BinarySearchExample.binarySearch(arr,0, last, key);
    }
}
