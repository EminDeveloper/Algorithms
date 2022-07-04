package nativealgoritm.searching.binarysearch.example3;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {2, 5, 7, 9, 12, 15, 34, 76, 87, 123};
        int aranan = 87;
        int enBuyuk = 10;
        int enKucuk = -1;
        int bayrak = 0;

        while(enBuyuk - enKucuk > 1){
            int bakilan = (enBuyuk + enKucuk)/2;
            if(a[bakilan] == aranan){
                bayrak = 1;
                System.out.println("bulunan: " + bakilan);
                break;
            }
            else if(a[bakilan] < aranan){
                enKucuk = bakilan;
            }
            else{
                enBuyuk = bakilan;
            }
        }
        if(bayrak == 0){
            System.out.println("Sayi bulunamadi");
        }

    }
}
