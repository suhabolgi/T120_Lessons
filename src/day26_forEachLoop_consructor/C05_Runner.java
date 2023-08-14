package day26_forEachLoop_consructor;

import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str = new String("Java Candir");



        C04                         obje       =          new       C04();

        //Class adi / Data turu    isim a  tama işareti  keyword    constructor

        System.out.println(obje.hiz); // 0
        System.out.println(obje.kapasite); // 0
        System.out.println(obje.ogrenciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1(); // method1 çalıştı

    }
    // herhangi bir class'ın içinden başka bir class'taki
    //  class üyelerine(method ve variable), ulaşmak isterseniz
    // hedef class tan bir obje oluşturabiliriz.

    // C04 classı statik olmamasına rağmen bütün sınıf üyelerine ulaştık.

    // java da bir class tan obje oluşturmak istediğimizde mutlaka bir constructor
    // çalışır.

    // javada objeler, class lardan üretilir.
    // bu classlardan obje üretilebilmesi için CONTRUCTOR olmalidir.
    // java bunu bildiği için oluşturulan her class'a obje oluşturulmasını sağlayan
    // DEFAULT CONTRUCTOR yerleştirir.

   /* default constructor GORUNMEZ
    Parametresizdir ve body'sinde kod yoktur.

    ONEMLI :
    Bir class'da gorunur bir constructor yoksa
    o class'da default constructor vardir
    Gorunur bir constructor varsa,
    Java default constructor'i siler*/





    /*default kelimesi birlikte kullanildigi kelime ile anlam kazanir
         default deger : class level'da olusturulan variable'lara
                         biz deger atamazsak, java default degerler atar
         default case    : switch statement'da hic bir case ile uyumlu olmayan
                         degerler icin tanimlanan kodlardir.
         default access modifier : icinde bulunulan class ve icinde bulunulan package'dan
                         erisilebilen class uyelerini belirler
         default constructor*/

}
