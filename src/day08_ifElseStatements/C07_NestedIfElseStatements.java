package day08_ifElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. E : Erkek, K : Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi girin.");
        double yas = scanner.nextDouble();

        /* birden fazla degisken varsa
        * iclerinden birini birincil degisken olarak alip
        * sadece ona göre bir if - else if - else kuralim
        */

        if (cinsiyet == 'E'){

            if (yas < 0 || yas > 100){
                System.out.println("gecersiz bir yas girdiniz.");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir.");
            } else {
                System.out.println("emekli olmak icin " + (65-yas) + " yil daha calismalisiniz.") ;
            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80){
                System.out.println("gecersiz bir yas girdiniz.");
            } else if (yas >= 60) {
                System.out.println("Kadin emekli olabilir.");
            } else {
                System.out.println("emekli olmak icin " + (60-yas) + " yil daha calismalisiniz.") ;
            }
            
        }else {
            System.out.println("cinsiyet hatali girildi.");
        }


    }
}
