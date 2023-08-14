package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri_Soru3 {
    public static void main(String[] args) {

        //SORU-3 Kullanicidan bir sayi alin,
        //      sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        //      5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0){
            System.out.println("girdiğiniz "+girilenSayi+ " sayisi 3 ile tam bolunebilir.");
        }
        if (girilenSayi % 5 == 0){
            System.out.println("girdiğiniz "+girilenSayi+ " sayisi 5 ile tam bolunebilir.");
        }

        if (girilenSayi %3 == 0) System.out.println("sayi 3 ile bölünür");// ilave cevap
        if (girilenSayi %5 == 0) System.out.println("sayi 5 ile bölünür");  // ilave cevap
    }
}
