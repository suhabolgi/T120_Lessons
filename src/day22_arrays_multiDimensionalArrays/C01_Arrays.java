package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"ali","ahmet","gökdeniz","arif","ercan","demir"};

        // verilen bir Arrayda uzunluğu tek sayı olan isimleri yan yana aralarında bir
        // boşluk bırakarak yazdirin,
        // em sonda da alt satıra geçerek toplam kaç isim yazdırıldığını yazdirin.

        int sayac =0;
        int kelimeUZunlugu = 0;

        for (int i = 0; i < isimler.length; i++) {
            kelimeUZunlugu = isimler[i].length();

            if (kelimeUZunlugu % 2 !=0){
                System.out.print(isimler[i] + ", ");
                sayac ++;
            }


        }
        System.out.println("\nToplam " + sayac + " adet isim yazdirildi.");
    }
}
