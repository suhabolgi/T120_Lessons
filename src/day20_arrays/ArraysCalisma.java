package day20_arrays;

import java.util.Arrays;

public class ArraysCalisma {
    public static void main(String[] args) {

        String [] harfler = {"a","b","c","d","e" };
        harfler[0] = "f";                       // 1. eleman yani 0. indeksteki elemana yeni değer atadım
                                                // a yerine f oldu.

        System.out.println(harfler); // yazdıralim @48140564 sonucunu verdi, bu harfler adındaki
                                     // variable'ın Huge memoryi de tuttuğu referans değeridir.

        System.out.println(harfler[0]); // f    0. indeksini yazdırır. yani tek bir elemanı-- //
        System.out.println(harfler[1]); // b    1. indeksindeki eleman
        System.out.println(harfler[2]); // c    2. indeksindeki eleman

        // eğer bir array'i  yazdirmak istersek, Arrays.toString(harfler).sout yazarız.

        System.out.println(Arrays.toString(harfler));     // [f, b, c, d, e]




        String[] sinifListeri = {"ali","ahmet","gökdeniz","arif","ercan","demir"};

        System.out.println(sinifListeri); // @58ceff1
        System.out.println(sinifListeri[2]); // gökdeniz
        System.out.println(sinifListeri[4]);   // ercan
        // System.out.println(sinifListeri[6]);     ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(sinifListeri));
        //  [ali, ahmet, gökdeniz, arif, ercan, demir]

        // 6 kişilik bir sınıf olşturun.

        String [] sinifListesi2 ={null, null, null, null, null, null};
        String [] sinifListesi3 = new String[6];

         /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- icine konulacak datalarin turu
            2- Array'in uzunlugu (Bir array'e olusturulurken yazilan uzunlugundan
                                    daha fazla element konulamaz)
         */

        // arraylarin en güzel dostu forLoop tur.
        // forLoop kullanarak arrayde bulunan elementleri yazdıralim.

        for (int i = 0; i < sinifListeri.length; i++) {
            System.out.print(sinifListeri[i] + " ");
            i++;

        }






    }
}
