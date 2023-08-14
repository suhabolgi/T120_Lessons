package day08_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements_Soru1_Yol2 {
    public static void main(String[] args) {
        // SORU-1
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyetinizi girin \nErkek ise E : \nKadin ise K : ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.print("lütfen yaşınızı girin :");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'e' || cinsiyet == 'E') {
            if (yas >= 65) {
                System.out.println("Emekli olabilisiniz");
            } else {
                System.out.println("emekli olabilmek için " + (65 - yas) + " yil daha çalışmaiz gerekir.");
            }
        } else if (cinsiyet == 'k' || cinsiyet == 'K') {
            if (yas >= 60) {
                System.out.println("Emekli olabilisiniz");
            } else {
                System.out.println("emekli olabilmek için" + (60 - yas) + " yil daha çalışmaiz gerekir.");
            }

        } else {
            System.out.println("yanlis bir tusa bastiniz, tekrar deneyin.");
        }


    }
}
