package day12_stringManipulations;

import java.util.Scanner;

public class C05_StringManipulations_Soru4_MySelf {
    public static void main(String[] args) {

        // Soru 4 :
        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin.
        //-  ilk harf kucuk harf olmali
        //-  son karakter rakam olmali
        //-  sifre bosluk icermemeli
        //-  uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen ilk harfi küçük olan, son karakteri rakam olan, boşluk içermeyen en az 10 karakterli bir" +
                "şifre girin : \nŞifre :");
        String girilenSifre = scanner.nextLine();

        if (!(girilenSifre.charAt(0) >= 'a' && girilenSifre.charAt(0) <= 'z')) {
            System.out.println("İlk harf küçük harf olamli");
        }
        char sonKarakter = girilenSifre.charAt(girilenSifre.length() - 1);
        if (sonKarakter >= 'a' && sonKarakter <= 'z') {
            System.out.println("Son karakter rakam olmalı");
        }
        if (girilenSifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        }
        if (girilenSifre.length() < 10) {
            System.out.println("şifrenin uzunluğu en az 10 karakter olamlıdır.");

        } else {
            System.out.println("şifre başarılı bir şelkilde kaydedildi.");
        }


    }
}
