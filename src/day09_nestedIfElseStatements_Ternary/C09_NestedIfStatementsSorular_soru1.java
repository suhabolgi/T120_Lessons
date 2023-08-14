package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_NestedIfStatementsSorular_soru1 {
    public static void main(String[] args) {

        // Soru 1-

        //  Kullanicidan cinsiyetini ve yasini alin,
        //  Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //  Cinsiyet ve yasini dikkate alarak ,
        //  “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyetinizi kadin ya da erkek olarak girin :");
        String cinsiyet = scanner.next();

        System.out.println("lütfen 16 ile 90 arasında bir yaş giriniz");
        int yas = scanner.nextInt();

        if (yas < 16 || yas > 90) {
            System.out.println("girdiğiniz yaşın istenen değerler arasında olup olmadiğini kontrol ediniz.");

        } else if (yas < 60) {
            if (cinsiyet.equals("kadın")) {
                System.out.println("emekliliğiniz için " + (60 - yas) + " yıl daha çalışmalisniniz");
            } else if (cinsiyet.equals("erkek")) {
                System.out.println("emekliliğiniz için " + (65 - yas) + " yıl daha çalışmalisniniz");
            } else {
                System.out.println("cinsiyet hatali");
            }

        } else if (yas < 65) {
            if (cinsiyet.equals("kadın")) {
                System.out.println("emekli olabiliriniz.");
            } else if (cinsiyet.equals("erkek")) {
                System.out.println("emekliliğiniz için " + (65 - yas) + " yıl daha çalışmalisniniz");
            } else {
                System.out.println("cinsiyet hatali");

            }


        } else { // herkes emekli olabilir
            if (cinsiyet.equals("kadın") || cinsiyet.equals("erkek")) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("cinsiyet hatali");
            }

        }


    }

}