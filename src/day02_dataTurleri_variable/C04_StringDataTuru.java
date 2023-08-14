package day02_dataTurleri_variable;

import java.nio.charset.StandardCharsets;

public class C04_StringDataTuru {
    public static void main(String[] args) {

        int sayi =20;

        String isim = "Süha Bolgı" ;
        System.out.println(isim.toUpperCase()); // isim. dediğimizde hazır metotlar gelir
        System.out.println(isim.toLowerCase()); //isim. dediğimizde hazır metotlar gelir
        System.out.println(isim.charAt(0)); // isim.charAt () parantes içine indeks girilir ve metindeki
        System.out.println(isim.charAt(1)); // o indeks yazdırılır.
        System.out.println(isim.charAt(2));
        System.out.println(isim.charAt(3));
        System.out.println(isim.charAt(4));
        System.out.println(isim.charAt(5));
        System.out.println(isim.charAt(6));
        System.out.println(isim.charAt(7));
        System.out.println(isim.charAt(8));
        System.out.println(isim.charAt(9));

       


        System.out.println(isim); // Süha Bolgı
        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(str1 + str2);
        // iki tane String + isareti ile toplanmaya calisilirsa
        // Java o iki String'i BIRLESTIRIR
        // JavaCandir

        String str3 = "30";
        String str4 = "40";
        System.out.println(str3 + str4); // 3040

        // Verilen isim ve soyismi
        // Girilen ali uzunkavak database'e kaydedildi
        // seklinde yazdirin
        String adi = "Ramazan";
        String soyadi = "Tatar";
        System.out.println("Girilen "+ adi + " " + soyadi + " database'e kaydedildi");
        // " " arasindaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        // System.out.println("Girilen "+        adi         + " " + soyadi + " database'e kaydedildi");
    }
}



















