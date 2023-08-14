package day13_stringManipulations_forLoops;

import java.util.Scanner;

public class C07_ForLoops_Soru7_MySelf {
    public static void main(String[] args) {

        // SORU-7
        // Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        // 1. AŞAMA ==>
        //  BasamakSayisi değişkenine, sayi değerinin string olarak dönüştürülmesi
        //  ve uzunluğunun alınmasıyla rakamların sayısı atanır.

        int basamaksayisi = ("" + girilenSayi).length();

        int rakam = 0;

        int rakamlarToplami = 0;

        // 2. AŞAMA ==>
        // Her bir basamagin ayrı ayrı hesaplanması sağlanır.
        // Her döngü adımında, sayi değişkeninin son basamağı rakam değişkenine atanır.
        // ilk adimda her bir basamagi hesaplamak bizim bu for dongusunu, basamak sayisi yani Stringe
        // cevirdigimiz sayinin rakam sayisi kadar dondurmemiz gerekecek, o yuzden sartimizi
        // i <= basamakSayisi na ayarliyoruz.

        for (int i = 1; i <= basamaksayisi; i++) {
            rakam = girilenSayi % 10; //

            rakamlarToplami += rakam;

            girilenSayi /= 10;
        }
        System.out.println("Verilen sayinin rakamlari toplami : " + rakamlarToplami);
    }
}
