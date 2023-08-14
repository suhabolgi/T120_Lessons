package day08_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements_Soru1 {
    public static void main(String[] args) {
        // SORU-1
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. E : Erkek, K : Kadın");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lütfen yasinizi girin.");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Erkek emekli olabilir.");
        } else if (cinsiyet == 'E' && yas < 65 ) {
            System.out.println("Erkek emekli olamaz " + (65-yas) + " yil daha calismalidir.");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Kadin emekli olamaz " + (60-yas) + " yil daha calismalidir.");
        }
    }
}
