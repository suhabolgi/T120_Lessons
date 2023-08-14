package day21_arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        // Soru 4-
        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,5,2,3,5,67,1,8};

        int arananSayi = 1;

        elemanSay(arr, arananSayi);
    }

    public static void elemanSay (int[] arr, int arananSayi){
        int sayac = 0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] == arananSayi){
                sayac +=1;
            }

        }
        if (sayac==0){
            System.out.println("aranana sayi array da yok");
        }else {
            System.out.println("aranan " +arananSayi + " array da "+ sayac + " kere kullanılmış");
        }


    }
}
