package day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_IsimListesi {
    public static void main(String[] args) {

        // ogrenci map'inde bulunan ogrencilerin isim ve soyisimlerini sira numarali bir liste olarak yazdirin.
        // bizden istenen bilgiye nassıl ulasabiliriz onu düsünecegiz.
        // isim ve soyisimler value tarafında oldugundan isimizin value'lar oldugunu artik biliyoruz.
        // ama sadece yetmez, map'lar kompleks bilgiler barindirabilir , ancak o bilginin detaylarina ulaşmak
        // çok asama gerektirebilir. bu tür karmasik islemleri her seferinde yeniden kodlamak yerine, ilk istendiginde
        // metod olarak olusturup, sonra ihtiyac durumunda o metodu kullanmak daha mantikli olur.
        // genelde metodlar bir class da toplanir.
        // bize bir Map döndurecek bir metod yazalim.

        // bir map ile islem yapmak istedigimizde ilk bakacagimiz seyin key ya da value de mi bulundugudur.
        // eğer sadece value'de olan bir bilgiyi ariyorsak,
        // 1- tum value'leri Collection olarak bir yerde kaydedelim,
        // 2- bir for -each loop ile he bir value'yu ele alalim.
        //  3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
        //               bu ayirac kullanilarak split() ile bir array'e donusturulebilir
        //            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
        //               istenen bilgiyi, array'den index ile alabiliriz
        //         */
        //
         Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
         ogrenciMap.put(110,"Kaan-Can-12-K-MF");

         System.out.println(ogrenciMap);
         // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Kaan-Can-12-K-MF}

         MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);

    }
}
