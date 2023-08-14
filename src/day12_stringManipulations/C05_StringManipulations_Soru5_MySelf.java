package day12_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations_Soru5_MySelf {
    public static void main(String[] args) {
        // Soru 5 :
        // Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        // Kullanıcıdan gerekli bilgileri aldık
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı girin. \nAdiniz :");
        String ad = scanner.next();
        System.out.print("Soyadınızı girin. \nSoyadiniz :");
        String soyad = scanner.next();

        // ad ve soyadın uzunluklarını ayrı ayrı vir variable'a atadık. atamadan da yapılırdı ama ben atadım.
        int adUzunluk = ad.length();
        int soyadUzunluk = soyad.length();

        // her iki durumu karşılaştıracağım, iki durum olduğundan if/Else kulllanacağım
        if (adUzunluk > soyadUzunluk) {
            System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() +
                    " " + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase());
        } else {
            System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() +
                    " " + soyad.toUpperCase());
        }


    }
}
