package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int[] sayilar = {2, 4, 6, 7, 8}; // int data türündeki sayilar variabla'ı sayilardan oluşan bir arraydir.

        String[] harfler = {"a", "b", "c", "d"};

        System.out.println(sayilar[1]); //4
        System.out.println(harfler[2]); // c

        String[] ogrenciList = {"süha", "Emre", "Ufuk", "Ela"};
        System.out.println(ogrenciList[1]); // Emre


        // 5 kişilik bir sınıf olşturun.

        String[] sinifListesi1 = {null, null, null, null, null};

        String[] sinifListesi2 = new String[5];

          /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- icine konulacak datalarin turu
            2- Array'in uzunlugu (Bir array'e olusturulurken yazilan uzunlugundan
                                    daha fazla element konulamaz)
         */
        // bir array'in tumunu nasil yazdirabiliriz ?
        System.out.println(sayilar);                    // [I@48140564

        // Array'in tamamini yazdirmak isterseniz
        // Arrays class'indan hazir method kullaniriz
        System.out.println(Arrays.toString(sayilar));       // [2, 4, 6, 7, 8]


        // dongu ile yazdiralim
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }                                               // 2 4 6 7 8
        System.out.println("");


        // for loop ile elementleri yazdiririz.
        // Arrays.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(harfler));        //    [a, b, c, d]
        System.out.println(Arrays.toString(sinifListesi1));  //      [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2));  //        [null, null, null, null, null]
        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar));        // [0, 0, 0, 0]
        boolean[] blList = new boolean[8];
        System.out.println(Arrays.toString(blList));           // [false, false, false, false, false, false, false, false]- array'in uzunluğu-(bir array'a oluşturulurken yazilan uzunluğundan daha fazla element konulamaz.


    }
}
