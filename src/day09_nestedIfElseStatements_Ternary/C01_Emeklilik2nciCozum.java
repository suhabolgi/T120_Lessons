package day09_nestedIfElseStatements_Ternary;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class C01_Emeklilik2nciCozum {
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

        if (yas<10 || yas >80){
            System.out.println("Gecersiz yas");
        } else if (yas < 60) { // kimse emekli olamaz
            if (cinsiyet == 'K'){
                System.out.println("Kadin emekli olabilmek icin daha " + (60-yas) + " yil daha calismali");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65-yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatali");
            }
        } else if (yas<65) { // sadece kadinlar emekli olabilir

            if (cinsiyet == 'K'){
                System.out.println("Kadin emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin daha " + (65-yas) + " yil daha calismali");
            }else {
                System.out.println("cinsiyet hatali");
            }
        }else{ // herkes emekli olabilir
            if (cinsiyet == 'K' || cinsiyet == 'E'){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("cinsiyet hatali");
            }

        }
    }
}
