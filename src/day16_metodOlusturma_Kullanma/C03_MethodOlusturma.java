package day16_metodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    // Soru 2-
    // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk
    // diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz"); // tek isim
        String isim = scanner.next(); // tek isim gireceğimiz için

        System.out.println("lütfen soyadinizi giriniz");// tek kelime
        String soyisim = scanner.next();

        // bir şeyler döndüren methotlarda , String, int vs.
        // döndürdüğü şeyi ya sonradan kulanabilmek için kaydederiz
        // ya da onu yazdirabiliriz.

        System.out.println(isimDuzenle(isim, soyisim));
        // istersek direk döndürdüğü sonucu yazdirabilir

        String duzenliIsim = isimDuzenle(isim, soyisim);
        // istersek ilerde kullanmak için "String duzenliIsim" adlı bir variabla'a da kaydedebiliriz.



    }

    public static String isimDuzenle(String isim, String soyisim) {
        isim    = isim.substring(0, 1).toUpperCase() +
                  isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0, 1).toUpperCase() +
                  soyisim.substring(1).toLowerCase();

        String istenenFormattaIsimSoyisim = isim + " " + soyisim;
        // yukarıdaki kod bloğunun bize dönderdiği String bir ifadeyi'de
        // String istenenFormattaIsimSoyisim adlı bir variable'a atamış olduk.
        // nihai olarak bizim elde ettiğimiz sonuç String istenenFormattaIsimSoyisim olduğundan
        // metod sonunda bu veriable'ı return ediyoruz.


        return istenenFormattaIsimSoyisim;// bize en son istediğimiz variable ne ise onu döndüreceğinden
        // buraya return istenenFormattaIsimSoyisim; ile metodu bitirdik.
    }


}
